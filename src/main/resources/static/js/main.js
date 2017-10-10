var app = (function () {

    var api = {
        menuTemplate: null,
        router: null,
        init: function () {
            this.menuTemplate = _.template($('.menu-template').html());
            var self = this;
            $.get("api/list", function (result) {
                _.each(Array.from(result), function (labName) {
                    $('.menu').append(self.menuTemplate({lab: labName}));

                });
            });
            Backbone.history.start();
        }
    };

    var Router = Backbone.Router.extend({
        routes: {
            "lab1": "lab1",
            "lab2": "lab2"
        },
        lab1: function () {
            new Lab1View();
        },
        lab2: function () {
            new Lab2View();
        }
    });

    api.router = new Router();
    return api;
})();

$(document).ready(function () {
    app.init();
});