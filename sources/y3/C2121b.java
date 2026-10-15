package y3;

import Z.e;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import d3.g;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: y3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2121b {
    public static final String[] c = {"*", "FCM", "GCM", ""};

    /* renamed from: a, reason: collision with root package name */
    public Object f15918a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15919b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0048, code lost:
    
        if (r0.isEmpty() != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C2121b(d3.g r3, int r4) {
        /*
            r2 = this;
            switch(r4) {
                case 1: goto L4e;
                default: goto L3;
            }
        L3:
            r2.<init>()
            r3.a()
            android.content.Context r4 = r3.f12617a
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r4 = r4.getSharedPreferences(r0, r1)
            r2.f15918a = r4
            r3.a()
            d3.i r4 = r3.c
            java.lang.String r0 = r4.f12631e
            if (r0 == 0) goto L1e
            goto L4b
        L1e:
            r3.a()
            java.lang.String r0 = r4.f12630b
            java.lang.String r3 = "1:"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L34
            java.lang.String r3 = "2:"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L34
            goto L4b
        L34:
            java.lang.String r3 = ":"
            java.lang.String[] r3 = r0.split(r3)
            int r4 = r3.length
            r0 = 4
            r1 = 0
            if (r4 == r0) goto L41
        L3f:
            r0 = r1
            goto L4b
        L41:
            r4 = 1
            r0 = r3[r4]
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L4b
            goto L3f
        L4b:
            r2.f15919b = r0
            return
        L4e:
            r2.<init>()
            r2.f15919b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y3.C2121b.<init>(d3.g, int):void");
    }

    public File a() {
        if (((File) this.f15918a) == null) {
            synchronized (this) {
                try {
                    if (((File) this.f15918a) == null) {
                        g gVar = (g) this.f15919b;
                        gVar.a();
                        this.f15918a = new File(gVar.f12617a.getFilesDir(), "PersistedInstallation." + ((g) this.f15919b).c() + ".json");
                    }
                } finally {
                }
            }
        }
        return (File) this.f15918a;
    }

    public void b(C2120a c2120a) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c2120a.f15913a);
            jSONObject.put("Status", e.b(c2120a.f15914b));
            jSONObject.put("AuthToken", c2120a.c);
            jSONObject.put("RefreshToken", c2120a.d);
            jSONObject.put("TokenCreationEpochInSecs", c2120a.f15916f);
            jSONObject.put("ExpiresInSecs", c2120a.f15915e);
            jSONObject.put("FisError", c2120a.f15917g);
            g gVar = (g) this.f15919b;
            gVar.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", gVar.f12617a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public String c() {
        String string;
        synchronized (((SharedPreferences) this.f15918a)) {
            string = ((SharedPreferences) this.f15918a).getString("|S|id", null);
        }
        return string;
    }

    public C2120a d() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(a());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i4 = e.c(5)[optInt];
        if (i4 == 0) {
            throw new NullPointerException("Null registrationStatus");
        }
        String str = i4 == 0 ? " registrationStatus" : "";
        if (str.isEmpty()) {
            return new C2120a(optString, i4, optString2, optString3, optLong2, optLong, optString4);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public String e() {
        PublicKey publicKey;
        synchronized (((SharedPreferences) this.f15918a)) {
            String str = null;
            String string = ((SharedPreferences) this.f15918a).getString("|S||P|", null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
                Log.w("ContentValues", "Invalid key stored " + e4);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
            return str;
        }
    }
}
