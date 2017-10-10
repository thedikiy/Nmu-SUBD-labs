var Lab2View = Backbone.View.extend({
    el: $('.content'),
    model: new CreditCards(),
    events: {
        'click .add-card': 'addCard'
    },
    addCard: function () {
        var card = new CreditCard({
            number: $('.number-input').val(),
            bank: $('.bank-input').val()
        });
        $('.number-input, .bank-input').val('');
        var self = this;
        card.save(null, {
            success: function () {
                self.model.add(card);
            }
        });
    },
    initialize: function () {
        this.template = _.template($('.lab2-template').html());
        this.model.fetch();
        this.$el.html(this.template);
        this.$el = this.$el.find('.card-list');
        _.bind(this.addCard, this);
        this.model.on("add", this.render, this);
    },
    render: function () {
        var self = this;
        this.$el.html('');
        _.each(this.model.toArray(), function (creditCard) {
            self.$el.append((new CreditCardView({model: creditCard})).render().$el);
        });
        return this;
    }
});