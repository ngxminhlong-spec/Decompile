package Q1;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.InterfaceC0933n2;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class z implements InterfaceC0933n2 {

    /* renamed from: o, reason: collision with root package name */
    public long f1736o;

    /* renamed from: p, reason: collision with root package name */
    public long f1737p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f1738q;

    public z(long j4) {
        this.f1737p = Long.MIN_VALUE;
        this.f1738q = new Object();
        this.f1736o = j4;
    }

    public z(long j4, long j5, String str) {
        h2.y.e(str);
        this.f1738q = str;
        this.f1737p = j4;
        this.f1736o = j5;
    }

    public z(FileChannel fileChannel, long j4, long j5) {
        this.f1738q = fileChannel;
        this.f1736o = j4;
        this.f1737p = j5;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063 A[Catch: UnsupportedEncodingException -> 0x0066, TRY_LEAVE, TryCatch #0 {UnsupportedEncodingException -> 0x0066, blocks: (B:16:0x0023, B:20:0x0063, B:28:0x0047, B:30:0x005c, B:31:0x005f, B:23:0x0038, B:25:0x0041), top: B:15:0x0023, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static Q1.z a(java.lang.String r12) {
        /*
            h2.y.i(r12)
            h2.y.e(r12)
            java.lang.String r0 = "\\."
            r1 = -1
            java.lang.String[] r0 = r12.split(r0, r1)
            int r1 = r0.length
            r2 = 2
            java.lang.String r3 = "FirebaseAppCheck"
            r4 = 0
            if (r1 >= r2) goto L20
            java.lang.String r0 = "Invalid token (too few subsections):\n"
            java.lang.String r0 = r0.concat(r12)
            android.util.Log.e(r3, r0, r4)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L7a
        L20:
            r1 = 1
            r0 = r0[r1]
            java.lang.String r1 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> L66
            r2 = 11
            byte[] r0 = android.util.Base64.decode(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L66
            java.lang.String r2 = "UTF-8"
            r1.<init>(r0, r2)     // Catch: java.io.UnsupportedEncodingException -> L66
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.io.UnsupportedEncodingException -> L66
            if (r0 == 0) goto L38
        L36:
            r0 = r4
            goto L61
        L38:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L46
            r0.<init>(r1)     // Catch: java.lang.Exception -> L46
            java.lang.Object r1 = org.json.JSONObject.NULL     // Catch: java.lang.Exception -> L46
            if (r0 == r1) goto L36
            r.e r0 = m2.AbstractC1806a.T(r0)     // Catch: java.lang.Exception -> L46
            goto L61
        L46:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.UnsupportedEncodingException -> L66
            java.lang.String r2 = "Failed to parse JSONObject into Map:\n"
            r1.<init>(r2)     // Catch: java.io.UnsupportedEncodingException -> L66
            r1.append(r0)     // Catch: java.io.UnsupportedEncodingException -> L66
            java.lang.String r0 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L66
            r1 = 3
            boolean r1 = android.util.Log.isLoggable(r3, r1)     // Catch: java.io.UnsupportedEncodingException -> L66
            if (r1 == 0) goto L5f
            android.util.Log.d(r3, r0, r4)     // Catch: java.io.UnsupportedEncodingException -> L66
        L5f:
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L66
        L61:
            if (r0 != 0) goto L7a
            java.util.Map r0 = java.util.Collections.EMPTY_MAP     // Catch: java.io.UnsupportedEncodingException -> L66
            goto L7a
        L66:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to decode token (charset unknown):\n"
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.e(r3, r0, r4)
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
        L7a:
            h2.y.i(r0)
            java.lang.String r1 = "iat"
            h2.y.e(r1)
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r2 = 0
            if (r1 != 0) goto L8e
            r4 = r2
            goto L92
        L8e:
            long r4 = r1.longValue()
        L92:
            java.lang.String r1 = "exp"
            h2.y.e(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 != 0) goto La0
            goto La4
        La0:
            long r2 = r0.longValue()
        La4:
            long r2 = r2 - r4
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r2 * r0
            Q1.z r6 = new Q1.z
            long r9 = r4 * r0
            r11 = r12
            r6.<init>(r7, r9, r11)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Q1.z.a(java.lang.String):Q1.z");
    }

    public static z c(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new z(jSONObject.getLong("expiresIn"), jSONObject.getLong("receivedAt"), jSONObject.getString("token"));
        } catch (JSONException e4) {
            Log.e("Q1.z", "Could not deserialize token: " + e4.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0933n2
    public long b() {
        return this.f1737p;
    }

    public void d(long j4) {
        synchronized (this.f1738q) {
            this.f1736o = j4;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0933n2
    public void e(MessageDigest[] messageDigestArr, long j4, int i4) {
        MappedByteBuffer map = ((FileChannel) this.f1738q).map(FileChannel.MapMode.READ_ONLY, this.f1736o + j4, i4);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    public boolean f() {
        synchronized (this.f1738q) {
            try {
                N1.n.f1204A.f1212j.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (this.f1737p + this.f1736o > elapsedRealtime) {
                    return false;
                }
                this.f1737p = elapsedRealtime;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
