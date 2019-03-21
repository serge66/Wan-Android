package com.github.serge66.wanandroid.bean;

public class LoginResultBean {

    /**
     * code : E001
     * message : 用户名或密码为空
     * data : {"userEntity":{"username":"yiling","password":"e10adc3949ba59abbe56e057f20f883e","nickname":"一零","realname":"北京一零科技有限公司","gender":"1","job":"开发","phone":"17611577633","createtime":1550431995000,"status":1,"remark":"测试","tocken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjoiXCJhcHBUb2tlbl8xX3lpbGluZ18xNTUwNTM5NDYzNTAxXzE1NTA1Mzk0NjM1MDFcIiJ9.2Wyc6wJ7aQWVpOqlKjcRhBEXl9Y3IpxXrXbUpgum41E","createtimeStr":"2019-2-18 3:33:15","id":1},"token":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjoiXCJhcHBUb2tlbl8xX3lpbGluZ18xNTUwNTM5NDYzNTAxXCIifQ.IWiJwC3e-wUiZsurczm5vqv9mVnkJ9y5dJ8k50q5LVg"}
     * status : true
     */

    private String code;
    private String message;
    private DataBean data;
    private boolean status;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public static class DataBean {
        /**
         * userEntity : {"username":"yiling","password":"e10adc3949ba59abbe56e057f20f883e","nickname":"一零","realname":"北京一零科技有限公司","gender":"1","job":"开发","phone":"17611577633","createtime":1550431995000,"status":1,"remark":"测试","tocken":"eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjoiXCJhcHBUb2tlbl8xX3lpbGluZ18xNTUwNTM5NDYzNTAxXzE1NTA1Mzk0NjM1MDFcIiJ9.2Wyc6wJ7aQWVpOqlKjcRhBEXl9Y3IpxXrXbUpgum41E","createtimeStr":"2019-2-18 3:33:15","id":1}
         * token : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjoiXCJhcHBUb2tlbl8xX3lpbGluZ18xNTUwNTM5NDYzNTAxXCIifQ.IWiJwC3e-wUiZsurczm5vqv9mVnkJ9y5dJ8k50q5LVg
         */

        private UserEntityBean userEntity;
        private String token;

        public UserEntityBean getUserEntity() {
            return userEntity;
        }

        public void setUserEntity(UserEntityBean userEntity) {
            this.userEntity = userEntity;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public static class UserEntityBean {
            /**
             * username : yiling
             * password : e10adc3949ba59abbe56e057f20f883e
             * nickname : 一零
             * realname : 北京一零科技有限公司
             * gender : 1
             * job : 开发
             * phone : 17611577633
             * createtime : 1550431995000
             * status : 1
             * remark : 测试
             * tocken : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwYXlsb2FkIjoiXCJhcHBUb2tlbl8xX3lpbGluZ18xNTUwNTM5NDYzNTAxXzE1NTA1Mzk0NjM1MDFcIiJ9.2Wyc6wJ7aQWVpOqlKjcRhBEXl9Y3IpxXrXbUpgum41E
             * createtimeStr : 2019-2-18 3:33:15
             * id : 1
             */

            private String username;
            private String password;
            private String nickname;
            private String realname;
            private String gender;
            private String job;
            private String phone;
            private long createtime;
            private int status;
            private String remark;
            private String tocken;
            private String createtimeStr;
            private int id;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getNickname() {
                return nickname;
            }

            public void setNickname(String nickname) {
                this.nickname = nickname;
            }

            public String getRealname() {
                return realname;
            }

            public void setRealname(String realname) {
                this.realname = realname;
            }

            public String getGender() {
                return gender;
            }

            public void setGender(String gender) {
                this.gender = gender;
            }

            public String getJob() {
                return job;
            }

            public void setJob(String job) {
                this.job = job;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public long getCreatetime() {
                return createtime;
            }

            public void setCreatetime(long createtime) {
                this.createtime = createtime;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getRemark() {
                return remark;
            }

            public void setRemark(String remark) {
                this.remark = remark;
            }

            public String getTocken() {
                return tocken;
            }

            public void setTocken(String tocken) {
                this.tocken = tocken;
            }

            public String getCreatetimeStr() {
                return createtimeStr;
            }

            public void setCreatetimeStr(String createtimeStr) {
                this.createtimeStr = createtimeStr;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            @Override
            public String toString() {
                return "UserEntityBean{" +
                        "username='" + username + '\'' +
                        ", password='" + password + '\'' +
                        ", nickname='" + nickname + '\'' +
                        ", realname='" + realname + '\'' +
                        ", gender='" + gender + '\'' +
                        ", job='" + job + '\'' +
                        ", phone='" + phone + '\'' +
                        ", createtime=" + createtime +
                        ", status=" + status +
                        ", remark='" + remark + '\'' +
                        ", tocken='" + tocken + '\'' +
                        ", createtimeStr='" + createtimeStr + '\'' +
                        ", id=" + id +
                        '}';
            }
        }

        @Override
        public String toString() {
            return "DataBean{" +
                    "userEntity=" + userEntity +
                    ", token='" + token + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "LoginResultBean{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", status=" + status +
                '}';
    }
}
