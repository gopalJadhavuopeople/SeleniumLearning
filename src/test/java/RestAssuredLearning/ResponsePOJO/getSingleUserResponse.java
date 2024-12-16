package RestAssuredLearning.ResponsePOJO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class getSingleUserResponse {

    // Fields to represent "data" and "support" from the JSON response
    private Data data;
    private Support support;

    // Getter and Setter for Data
    @JsonProperty("data")
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    // Getter and Setter for Support
    @JsonProperty("support")
    public Support getSupport() {
        return support;
    }

    public void setSupport(Support support) {
        this.support = support;
    }

    // Inner class for "data" part of the JSON response
    public static class Data {
        private int id;
        private String email;
        private String first_name;
        private String last_name;
        private String avatar;

        // Getter and Setter for id
        @JsonProperty("id")
        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        // Getter and Setter for email
        @JsonProperty("email")
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        // Getter and Setter for first_name
        @JsonProperty("first_name")
        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        // Getter and Setter for last_name
        @JsonProperty("last_name")
        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        // Getter and Setter for avatar
        @JsonProperty("avatar")
        public String getAvatar() {
            return avatar;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }

    // Inner class for "support" part of the JSON response
    public static class Support {
        private String url;
        private String text;

        // Getter and Setter for url
        @JsonProperty("url")
        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        // Getter and Setter for text
        @JsonProperty("text")
        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
