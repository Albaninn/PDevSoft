class UserService {
    constructor(UserModel) {
      this.User = UserModel;
    }
  
    async createUser(userData) {
      const user = await this.User.create(userData);
      return user;
    }
  
    // ... outros métodos
  }
  
  module.exports = UserService;
  