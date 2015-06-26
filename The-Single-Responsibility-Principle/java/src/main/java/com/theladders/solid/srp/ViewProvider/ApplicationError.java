package com.theladders.solid.srp.viewprovider;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.theladders.solid.srp.result.Result;
import com.theladders.solid.srp.http.HttpResponse;
import com.theladders.solid.srp.result.ResultType;

public class ApplicationError implements ViewProvider
{
  public void provideView(HttpResponse response, Map<String, Object> model) {
    List<String> errList = new ArrayList<>();
    errList.add("We could not process your application.");

    Result result = new Result(ResultType.ERROR, model, errList);
    response.setResult(result);
  }
}
