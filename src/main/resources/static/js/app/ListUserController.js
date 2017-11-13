'use strict';

angular.module('crudApp').controller('ListUserController',
    ['UserService', '$scope',  function( UserService, $scope) {

        var self = this;
        self.user = {};
        self.users=[];
        self.getAllUsers = getAllUsers;
        /*self.submit = submit;
        self.getAllUsers = getAllUsers;
        self.createUser = createUser;
        self.updateUser = updateUser;
        self.removeUser = removeUser;
        self.editUser = editUser;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;
*/
        function getAllUsers() {
                return UserService.getAllUsers();
            }


    }


    ]);