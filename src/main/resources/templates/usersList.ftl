
<div class="panel panel-default">
    <!-- Default panel contents -->
    <div class="panel-heading"><span class="lead">Users List</span></div>
    <div layout="row" align="right">
    <button type="button" ui-sref="home" class="btn btn-success custom-width">Add User</button>
    </div>
    <div>
        &nbsp;
    </div>
    <div class="panel-body">
        <div class="table-responsive">
            <table class="table table-hover">
                <thead>
                <tr>
                    <th>User Id</th>
                    <th>NAME</th>
                    <th>AGE</th>
                    <th>SALARY</th>
                    <th width="100"></th>
                    <th width="100"></th>
                </tr>
                </thead>
                <tbody>
                <tr ng-repeat="u in ctrl.getAllUsers()">
                    <td>{{u.userId}}</td>
                    <td>{{u.name}}</td>
                    <td>{{u.age}}</td>
                    <td>{{u.salary}}</td>
                    <td><button type="button" ng-click="ctrl.editUser(u.id)"  class="btn btn-success custom-width">Edit</button></td>
                    <td><button type="button" ng-click="ctrl.removeUser(u.id)" class="btn btn-danger custom-width">Remove</button></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>