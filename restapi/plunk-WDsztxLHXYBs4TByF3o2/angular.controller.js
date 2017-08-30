(function(){
  angular.module('bunker')
         .controller('MainController',mainController);
  function mainController() {
    var vmMain = this;
    vmMain.header = 'Profiler';
    vmMain.users = [{
                      id: 400,
                      name: 'Shubh',
                      profile: 'Software Developer',
                      profilePicture: 'http://lorempixel.com/200/100'
                    },{
                      id: 401,
                      name: 'Neha',
                      profile: 'Software Developer',
                      profilePicture: 'http://lorempixel.com/200/200'
      
                    },{
                      id: 402,
                      name: 'Sam',
                      profile: 'Software Developer',
                      profilePicture: 'http://lorempixel.com/200/300'
                    },
                    {
                      id: 403,
                      name: 'Sam',
                      profile: 'Software Developer',
                      profilePicture: 'http://lorempixel.com/200/400'
                    },
                    {
                      id: 404,
                      name: 'Sam',
                      profile: 'Software Developer',
                      profilePicture: 'http://lorempixel.com/200/500'
                    }];
                    
      vmMain.addUser = function() {
        console.log('add user');
        vmMain.users.unshift(vmMain.newUser);
        vmMain.newUser = null;
      } 
      
      vmMain.deleteUser = function(id) {
        _.remove(vmMain.users, function(user){
          return user.id === id;
        });
      }
  }    
})();