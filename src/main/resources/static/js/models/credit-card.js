var CreditCard = Backbone.Model.extend({
   defaults:{
       number:'',
       bank:''
   },
    url:"/api/credit-cards"
});