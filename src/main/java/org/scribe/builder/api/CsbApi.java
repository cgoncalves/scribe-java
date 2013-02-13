package org.scribe.builder.api;

import org.scribe.model.*;

public class CsbApi extends DefaultApi10a
{
  private static final String AUTHORIZE_URL = "http://localhost:8080/csb/oauth/authorize?oauth_token=%s";
  private static final String ACCESS_URL = "http://localhost:8080/csb/oauth/access_token";
  private static final String REQUEST_URL = "http://localhost:8080/csb/oauth/request_token";

  @Override
  public String getAccessTokenEndpoint()
  {
    return ACCESS_URL;
  }

  @Override
  public String getRequestTokenEndpoint()
  {
    return REQUEST_URL;
  }

  @Override
  public String getAuthorizationUrl(Token requestToken)
  {
    return String.format(AUTHORIZE_URL, requestToken.getToken());
  }
}