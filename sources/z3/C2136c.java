package z3;

import android.content.Context;
import android.text.TextUtils;
import android.util.JsonReader;
import android.util.Log;
import com.google.android.gms.internal.ads.C0470c9;
import h2.y;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;
import w3.InterfaceC2053a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: z3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136c {
    public static final Pattern d = Pattern.compile("[0-9]+s");

    /* renamed from: e, reason: collision with root package name */
    public static final Charset f15983e = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    public final Context f15984a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC2053a f15985b;
    public final C2137d c = new C2137d();

    public C2136c(Context context, InterfaceC2053a interfaceC2053a) {
        this.f15984a = context;
        this.f15985b = interfaceC2053a;
    }

    public static URL a(String str) {
        try {
            return new URL("https://firebaseinstallations.googleapis.com/v1/" + str);
        } catch (MalformedURLException e4) {
            throw new C0470c9(e4.getMessage());
        }
    }

    public static void b(HttpURLConnection httpURLConnection, String str, String str2, String str3) {
        InputStream errorStream = httpURLConnection.getErrorStream();
        String str4 = null;
        if (errorStream != null) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, f15983e));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    sb.append(readLine);
                    sb.append('\n');
                }
                str4 = String.format("Error when communicating with the Firebase Installations server API. HTTP response: [%d %s: %s]", Integer.valueOf(httpURLConnection.getResponseCode()), httpURLConnection.getResponseMessage(), sb);
            } catch (IOException unused) {
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
            try {
                bufferedReader.close();
            } catch (IOException unused3) {
            }
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        Log.w("Firebase-Installations", str4);
        Log.w("Firebase-Installations", "Firebase options used while communicating with Firebase server APIs: " + str2 + ", " + str3 + (TextUtils.isEmpty(str) ? "" : n0.a.k(", ", str)));
    }

    public static long d(String str) {
        y.a("Invalid Expiration Timestamp.", d.matcher(str).matches());
        if (str == null || str.length() == 0) {
            return 0L;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }

    public static C2134a e(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f15983e));
        androidx.activity.result.c a4 = C2135b.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        C2135b c2135b = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("name")) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        a4.f2432b = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a4.c = Long.valueOf(d(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                C2135b a5 = a4.a();
                jsonReader.endObject();
                c2135b = a5;
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        return new C2134a(str, str2, str3, c2135b, 1);
    }

    public static C2135b f(HttpURLConnection httpURLConnection) {
        InputStream inputStream = httpURLConnection.getInputStream();
        JsonReader jsonReader = new JsonReader(new InputStreamReader(inputStream, f15983e));
        androidx.activity.result.c a4 = C2135b.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                a4.f2432b = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a4.c = Long.valueOf(d(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        inputStream.close();
        a4.f2431a = 1;
        return a4.a();
    }

    public static void g(HttpURLConnection httpURLConnection, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fid", str);
            jSONObject.put("appId", str2);
            jSONObject.put("authVersion", "FIS_v2");
            jSONObject.put("sdkVersion", "a:17.0.1");
            i(httpURLConnection, jSONObject.toString().getBytes("UTF-8"));
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static void h(HttpURLConnection httpURLConnection) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sdkVersion", "a:17.0.1");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("installation", jSONObject);
            i(httpURLConnection, jSONObject2.toString().getBytes("UTF-8"));
        } catch (JSONException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public static void i(HttpURLConnection httpURLConnection, byte[] bArr) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream == null) {
            throw new IOException("Cannot send request to FIS servers. No OutputStream available.");
        }
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
        try {
            gZIPOutputStream.write(bArr);
        } finally {
            try {
                gZIPOutputStream.close();
                outputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[Catch: NameNotFoundException -> 0x00b9, TryCatch #0 {NameNotFoundException -> 0x00b9, blocks: (B:8:0x006c, B:10:0x007e, B:17:0x0088, B:21:0x0095, B:23:0x00a5, B:27:0x00bb, B:29:0x00c5, B:31:0x00de), top: B:7:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[Catch: NameNotFoundException -> 0x00b9, TryCatch #0 {NameNotFoundException -> 0x00b9, blocks: (B:8:0x006c, B:10:0x007e, B:17:0x0088, B:21:0x0095, B:23:0x00a5, B:27:0x00bb, B:29:0x00c5, B:31:0x00de), top: B:7:0x006c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection c(java.net.URL r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2136c.c(java.net.URL, java.lang.String):java.net.HttpURLConnection");
    }
}
