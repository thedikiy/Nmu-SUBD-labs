var Lab1View = Backbone.View.extend({
  el:$('.content'),
  initialize: function(){
    this.template = _.template($('.lab1-template').html());
    this.$el.html(this.template);
  },
  events:{
      'click .submit-name': 'submit'
    },
  submit: function(){
    var self = this;
    $.get("api/lab1?name="+$('.input-name').val(),  function(result){
      console.log(result);
      self.$el.html("<h3>"+result+"</h3>");
      app.router.navigate("success");
    });
  }
});