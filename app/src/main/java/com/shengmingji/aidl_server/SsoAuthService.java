package com.shengmingji.aidl_server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;

import com.shengmingji.aidl.SsoAuth;

public class SsoAuthService extends Service {

    private String TAG = "TAG";

    SsoAuthImpl mBinder = new SsoAuthImpl();
    public SsoAuthService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    class SsoAuthImpl extends SsoAuth.Stub {

        @Override
        public void basicTypes(int anInt, long aLong, boolean aBoolean, float aFloat, double aDouble, String aString) throws RemoteException {
            Log.i(TAG, "basicTypes: ");
        }

        @Override
        public void ssoAuth(String name, String pwd) throws RemoteException {
            Log.i(TAG, "ssoAuth: >>>"+name+"  密码：>"+pwd);
        }
    }
}
