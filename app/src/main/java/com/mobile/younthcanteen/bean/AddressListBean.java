package com.mobile.younthcanteen.bean;

import java.io.Serializable;
import java.util.List;

/**
 * author：hj
 * time: 2017/2/22 0022 11:35
 */

public class AddressListBean implements Serializable{

    /**
     * results : [{"addr":"520","addressid":6,"consignee":"苗苗","office":"御玺大厦","officeid":1,"sex":1,"tel":"17739775520"}]
     * returnCode : 0
     * returnMessage : 获取成功
     */

    private String returnCode;
    private String returnMessage;
    /**
     * addr : 520
     * addressid : 6
     * consignee : 苗苗
     * office : 御玺大厦
     * officeid : 1
     * sex : 1
     * tel : 17739775520
     */

    private List<ResultsEntity> results;

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

    public List<ResultsEntity> getResults() {
        return results;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public static class ResultsEntity implements Serializable{
        private String addr;
        private String addressid;
        private String consignee;
        private String office;
        private String officeid;
        private String sex;
        private String tel;

        public String getAddr() {
            return addr;
        }

        public void setAddr(String addr) {
            this.addr = addr;
        }

        public String getAddressid() {
            return addressid;
        }

        public void setAddressid(String addressid) {
            this.addressid = addressid;
        }

        public String getConsignee() {
            return consignee;
        }

        public void setConsignee(String consignee) {
            this.consignee = consignee;
        }

        public String getOffice() {
            return office;
        }

        public void setOffice(String office) {
            this.office = office;
        }

        public String getOfficeid() {
            return officeid;
        }

        public void setOfficeid(String officeid) {
            this.officeid = officeid;
        }

        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }
    }
}
