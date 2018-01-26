/*
 * Copyright (C) 2017 University of Goettingen, Germany
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.ugoe.cs.smartshark;

/**
 * @author Fabian Trautsch
 */
public class Utils {
    public static String createMongoDBURI(String user, String password, String host, String port,
                                          String authenticationDB, Boolean sslEnabled) {
        if(host == null || port == null || sslEnabled == null) {
            throw new NullPointerException("Host, Port and sslEnabled must not be null");
        }
        String uri = "mongodb://";

        if(isAuthenticationEnabled(user, password)) {
            uri = uri+user+":"+password+"@"+host+":"+port;
        } else {
            uri = uri+host+":"+port;
        }

        if((isAuthenticationEnabled(user, password) &&
                authenticationDB != null && !authenticationDB.equals("")) || sslEnabled) {
            uri = uri+"/?";
        }

        if(isAuthenticationEnabled(user, password) &&
                authenticationDB != null && !authenticationDB.equals("")) {
            uri = uri+"authSource="+authenticationDB+"&";
        }

        if(sslEnabled) {
            uri = uri+"ssl=true&ssl_cert_reqs=CERT_NONE&";
        }

        if(uri.substring(uri.length()-1).equals("&")) {
            uri = uri.substring(0, uri.length()-1);
        }

        return uri;
    }

    private static Boolean isAuthenticationEnabled(String user, String password) {
        return user != null && !user.equals("") && password != null && !password.equals("");
    }
}
