var CreditCards = Backbone.Collection.extend({
    url:"/api/credit-cards",
    model: CreditCard
});