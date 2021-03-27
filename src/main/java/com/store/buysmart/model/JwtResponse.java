package com.store.buysmart.model;

//This is class is required for creating a response containing the JWT to be returned to the user
public class JwtResponse {

    private static final long serialVersionUID = -8091879091924046844L;

    private String jwtToken;

    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public JwtResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }
}
