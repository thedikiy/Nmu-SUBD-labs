package com.tdkdev.edu.subdlabs.dao.impl;

import com.tdkdev.edu.subdlabs.dao.CreditCardRepository;
import com.tdkdev.edu.subdlabs.entity.CreditCard;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CreditCardRepositoryImpl implements CreditCardRepository {

    private String createTableQuery = "create table if not exists credit_card ( number VARCHAR(12), bank VARCHAR(32))";

    private String insertQuery = "insert into credit_card values(?, ?)";

    private String selectQuery = "select * from credit_card";

    public void createCreditCardTable() {
        try (Connection connection = RepositoryUtil.getConnection()) {
            Statement statement = connection.createStatement();
            statement.execute(createTableQuery);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addCreditCard(CreditCard creditCard) {
        try (Connection connection = RepositoryUtil.getConnection()) {
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1, creditCard.getNumber());
            statement.setString(2, creditCard.getBank());
            statement.execute();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<CreditCard> getCreditCardList() {
        List<CreditCard> creditCards = new ArrayList<>();
        try (Connection connection = RepositoryUtil.getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(selectQuery);
            while (resultSet.next()){
                String number = resultSet.getString("number");
                String bank = resultSet.getString("bank");

                creditCards.add(new CreditCard(number,bank));
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return creditCards;
    }
}
