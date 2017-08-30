<table class="table table-striped">
              <thead>
              <tr>
              <th>Profile-Picture</th>
              <th>Name</th>
              <th>Profile</th>
              <th>Action</th>
              </tr>
              </thead>
              <tbody>
              <tr ng-repeat="user in mainVMCntrl.users">
              <td>
                <img class="profile-pic" ng-src="{{user.profilePicture}}" />
              </td>
              <td>{{user.name}}</td>
              <td>{{user.profile}}</td>
              <td ng-click="mainVMCntrl.deleteUser(user.id)">
                <i class="glyphicon glyphicon-remove"></i>
                </td>
              </tr>
              </tbody>
</table>