package com.theladders.solid.srp.viewprovider;

import java.util.Map;

import com.theladders.solid.srp.result.Result;
import com.theladders.solid.srp.http.HttpResponse;
import com.theladders.solid.srp.result.ResultType;

public class ApplySuccess implements ViewProvider
{
  public void provideView(HttpResponse response,
                          Map<String, Object> model) {
    Result result = new Result(ResultType.SUCCESS, model);
    response.setResult(result);
  }
}
