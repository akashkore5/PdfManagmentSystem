package com.spotdraft.pdfmanagment.utility;

import javax.servlet.http.HttpServletRequest;

/**
 * Utility class for common operations.
 */
public class Utility {

    /**
     * Retrieves the base site URL from the HttpServletRequest.
     *
     * @param request the HttpServletRequest object
     * @return the base site URL
     */
    public static String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }

     /**
     * Retrieves the base WebSite URL from the HttpServletRequest.
     * @param request the HttpServletRequest object
     * @return the base site URL
     */
    public static String getWebsiteSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }
}
