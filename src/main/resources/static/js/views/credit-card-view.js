var CreditCardView = Backbone.View.extend({
    model: new CreditCard(),
    tagName: 'tr',
    initialize: function () {
        this.template = _.template($('.card-template').html());
    },
    render: function () {
        this.$el.html(this.template(this.model.toJSON()));
        return this;
    }
});