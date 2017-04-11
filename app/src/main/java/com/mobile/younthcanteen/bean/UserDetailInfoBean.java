package com.mobile.younthcanteen.bean;

import java.io.Serializable;

/**
 * author：hj
 * time: 2017/3/11 0011 19:17
 */


public class UserDetailInfoBean implements Serializable{

    /**
     * account :
     * birthday :
     * email :
     * grade : 少年
     * imgs : []
     * imgtype :
     * ispaypassset : false
     * money : 0
     * nick : zz_13373931172
     * phone : 13373931172
     * point : 0
     * tjaccount :
     * token : 3293a90de39c6c78
     * userid : 6
     */

    private ResultsEntity results;
    /**
     * results : {"account":"","birthday":"","email":"","grade":"少年","imgs":[],"imgtype":"","ispaypassset":false,"money":0,"nick":"zz_13373931172","phone":"13373931172","point":0,"tjaccount":"","token":"3293a90de39c6c78","userid":6}
     * returnCode : 0
     * returnMessage : 成功
     */

    private String returnCode;
    private String returnMessage;

    public ResultsEntity getResults() {
        return results;
    }

    public void setResults(ResultsEntity results) {
        this.results = results;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMessage() {
        return returnMessage;
    }

    public void setReturnMessage(String returnMessage) {
        this.returnMessage = returnMessage;
    }

    public static class ResultsEntity implements Serializable{
        private String account;
        private String birthday;
        private String email;
        private String grade;
        private String imgtype;
        private boolean ispaypassset;
        private String money;
        private String nick;
        private String phone;
        private String point;
        private String tjaccount;
        private String token;
        private String userid;
        private String imgs;

        public String getAccount() {
            return account;
        }

        public void setAccount(String account) {
            this.account = account;
        }

        public String getBirthday() {
            return birthday;
        }

        public void setBirthday(String birthday) {
            this.birthday = birthday;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getGrade() {
            return grade;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getImgtype() {
            return imgtype;
        }

        public void setImgtype(String imgtype) {
            this.imgtype = imgtype;
        }

        public boolean isIspaypassset() {
            return ispaypassset;
        }

        public void setIspaypassset(boolean ispaypassset) {
            this.ispaypassset = ispaypassset;
        }

        public String getMoney() {
            return money;
        }

        public void setMoney(String money) {
            this.money = money;
        }

        public String getNick() {
            return nick;
        }

        public void setNick(String nick) {
            this.nick = nick;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getPoint() {
            return point;
        }

        public void setPoint(String point) {
            this.point = point;
        }

        public String getTjaccount() {
            return tjaccount;
        }

        public void setTjaccount(String tjaccount) {
            this.tjaccount = tjaccount;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }


        public String getImgs() {
            return imgs;
        }

        public void setImgs(String imgs) {
            this.imgs = imgs;
        }
    }
}
