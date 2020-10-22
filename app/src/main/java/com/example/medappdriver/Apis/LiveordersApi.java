package com.example.medappdriver.Apis;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface LiveordersApi {
    @POST("user/showLiveOrders")
    Call<Liveorders> liveorder(@Body RequestBody user
    );

    public class Datum {

        @SerializedName("orderID")
        @Expose
        private Integer orderID;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("userID")
        @Expose
        private Integer userID;
        @SerializedName("captainID")
        @Expose
        private Object captainID;
        @SerializedName("medicineID")
        @Expose
        private Integer medicineID;
        @SerializedName("pharmacyStage")
        @Expose
        private Integer pharmacyStage;
        @SerializedName("userStage")
        @Expose
        private Integer userStage;
        @SerializedName("payed")
        @Expose
        private Integer payed;
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("statu")
        @Expose
        private String statu;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public Integer getOrderID() {
            return orderID;
        }

        public void setOrderID(Integer orderID) {
            this.orderID = orderID;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getUserID() {
            return userID;
        }

        public void setUserID(Integer userID) {
            this.userID = userID;
        }

        public Object getCaptainID() {
            return captainID;
        }

        public void setCaptainID(Object captainID) {
            this.captainID = captainID;
        }

        public Integer getMedicineID() {
            return medicineID;
        }

        public void setMedicineID(Integer medicineID) {
            this.medicineID = medicineID;
        }

        public Integer getPharmacyStage() {
            return pharmacyStage;
        }

        public void setPharmacyStage(Integer pharmacyStage) {
            this.pharmacyStage = pharmacyStage;
        }

        public Integer getUserStage() {
            return userStage;
        }

        public void setUserStage(Integer userStage) {
            this.userStage = userStage;
        }

        public Integer getPayed() {
            return payed;
        }

        public void setPayed(Integer payed) {
            this.payed = payed;
        }

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getStatu() {
            return statu;
        }

        public void setStatu(String statu) {
            this.statu = statu;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }



    public class Liveorders {

        @SerializedName("data")
        @Expose
        private List<Datum> data = null;

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

    }
}//endofclass
