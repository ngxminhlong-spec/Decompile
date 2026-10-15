package F3;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.measurement.C1510e1;
import d3.g;
import h2.y;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import v3.C2033d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: j, reason: collision with root package name */
    public static final Uri f742j = Uri.parse("https://firebasestorage.googleapis.com/v0");

    /* renamed from: k, reason: collision with root package name */
    public static final C2033d f743k = new C2033d(6);

    /* renamed from: a, reason: collision with root package name */
    public Exception f744a;

    /* renamed from: b, reason: collision with root package name */
    public final C1510e1 f745b;
    public final Context c;
    public Map d;

    /* renamed from: e, reason: collision with root package name */
    public int f746e;

    /* renamed from: f, reason: collision with root package name */
    public String f747f;

    /* renamed from: g, reason: collision with root package name */
    public InputStream f748g;

    /* renamed from: h, reason: collision with root package name */
    public HttpURLConnection f749h;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f750i = new HashMap();

    public a(C1510e1 c1510e1, g gVar) {
        y.i(gVar);
        this.f745b = c1510e1;
        gVar.a();
        this.c = gVar.f12617a;
        gVar.a();
        m("x-firebase-gmpid", gVar.c.f12630b);
    }

    public final void a(HttpURLConnection httpURLConnection, String str) {
        byte[] d;
        int e4;
        y.i(httpURLConnection);
        if (TextUtils.isEmpty(null)) {
            Log.w("NetworkRequest", "no auth token for request");
        } else {
            httpURLConnection.setRequestProperty("Authorization", "Firebase null");
        }
        if (TextUtils.isEmpty(str)) {
            Log.w("NetworkRequest", "No App Check token for request.");
        } else {
            httpURLConnection.setRequestProperty("x-firebase-appcheck", str);
        }
        httpURLConnection.setRequestProperty("X-Firebase-Storage-Version", "Android/20.3.0");
        for (Map.Entry entry : this.f750i.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        JSONObject c = c();
        if (c != null) {
            d = c.toString().getBytes("UTF-8");
            e4 = d.length;
        } else {
            d = d();
            e4 = e();
            if (e4 == 0 && d != null) {
                e4 = d.length;
            }
        }
        if (d == null || d.length <= 0) {
            httpURLConnection.setRequestProperty("Content-Length", "0");
        } else {
            if (c != null) {
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
            }
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty("Content-Length", Integer.toString(e4));
        }
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if (d == null || d.length <= 0) {
            return;
        }
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            Log.e("NetworkRequest", "Unable to write to the http request!");
            return;
        }
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        try {
            bufferedOutputStream.write(d, 0, e4);
        } finally {
            bufferedOutputStream.close();
        }
    }

    public final HttpURLConnection b() {
        Uri i4 = i();
        Map f4 = f();
        if (f4 != null) {
            Uri.Builder buildUpon = i4.buildUpon();
            for (Map.Entry entry : ((HashMap) f4).entrySet()) {
                buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
            }
            i4 = buildUpon.build();
        }
        URL url = new URL(i4.toString());
        f743k.getClass();
        return (HttpURLConnection) url.openConnection();
    }

    public JSONObject c() {
        return null;
    }

    public byte[] d() {
        return null;
    }

    public int e() {
        return 0;
    }

    public Map f() {
        return null;
    }

    public final JSONObject g() {
        if (TextUtils.isEmpty(this.f747f)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(this.f747f);
        } catch (JSONException e4) {
            Log.e("NetworkRequest", "error parsing result into JSON:" + this.f747f, e4);
            return new JSONObject();
        }
    }

    public final String h(String str) {
        List list;
        Map map = this.d;
        if (map == null || (list = (List) map.get(str)) == null || list.size() <= 0) {
            return null;
        }
        return (String) list.get(0);
    }

    public abstract Uri i();

    public final boolean j() {
        int i4 = this.f746e;
        return i4 >= 200 && i4 < 300;
    }

    public final void k(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        if (inputStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                } finally {
                    bufferedReader.close();
                }
            }
        }
        this.f747f = sb.toString();
        if (j()) {
            return;
        }
        this.f744a = new IOException(this.f747f);
    }

    public final void l(Context context, String str) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            this.f744a = new SocketException("Network subsystem is unavailable");
            this.f746e = -2;
            return;
        }
        if (this.f744a != null) {
            this.f746e = -1;
        } else {
            if (Log.isLoggable("NetworkRequest", 3)) {
                Log.d("NetworkRequest", "sending network request POST " + i());
            }
            NetworkInfo activeNetworkInfo2 = ((ConnectivityManager) this.c.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo2 == null || !activeNetworkInfo2.isConnected()) {
                this.f746e = -2;
                this.f744a = new SocketException("Network subsystem is unavailable");
            } else {
                try {
                    HttpURLConnection b4 = b();
                    this.f749h = b4;
                    b4.setRequestMethod("POST");
                    a(this.f749h, str);
                    HttpURLConnection httpURLConnection = this.f749h;
                    y.i(httpURLConnection);
                    this.f746e = httpURLConnection.getResponseCode();
                    this.d = httpURLConnection.getHeaderFields();
                    httpURLConnection.getContentLength();
                    if (j()) {
                        this.f748g = httpURLConnection.getInputStream();
                    } else {
                        this.f748g = httpURLConnection.getErrorStream();
                    }
                    if (Log.isLoggable("NetworkRequest", 3)) {
                        Log.d("NetworkRequest", "network request result " + this.f746e);
                    }
                } catch (IOException e4) {
                    Log.w("NetworkRequest", "error sending network request POST " + i(), e4);
                    this.f744a = e4;
                    this.f746e = -2;
                }
            }
        }
        try {
            if (j()) {
                k(this.f748g);
            } else {
                k(this.f748g);
            }
        } catch (IOException e5) {
            Log.w("NetworkRequest", "error sending network request POST " + i(), e5);
            this.f744a = e5;
            this.f746e = -2;
        }
        HttpURLConnection httpURLConnection2 = this.f749h;
        if (httpURLConnection2 != null) {
            httpURLConnection2.disconnect();
        }
    }

    public final void m(String str, String str2) {
        this.f750i.put(str, str2);
    }
}
