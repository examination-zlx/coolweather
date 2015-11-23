package util;

/**
 * Created by zhanglongxiang on 15/11/23.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
