'use strict';

angular.module('crudApp').controller('GetUSerDetailsControllers',
    ['UserService', '$scope',  function( UserService, $scope) {

        var self = this;
        self.user = {};
        self.users=[];
        self.editUser = editUser;

        function editUser(id) {
            self.successMessage='';
            self.errorMessage='';
            UserService.getUser(id).then(
                function (user) {
                    self.user = user;
                },
                function (errResponse) {
                    console.error('Error while removing user ' + id + ', Error :' + errResponse.data);
                }
            );
        }


    }


    ]);