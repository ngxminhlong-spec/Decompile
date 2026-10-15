package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.qB, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1071qB extends AbstractC1398xw implements LB {

    /* renamed from: A, reason: collision with root package name */
    public boolean f10322A;

    /* renamed from: B, reason: collision with root package name */
    public int f10323B;

    /* renamed from: C, reason: collision with root package name */
    public long f10324C;

    /* renamed from: D, reason: collision with root package name */
    public long f10325D;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f10326s;

    /* renamed from: t, reason: collision with root package name */
    public final int f10327t;

    /* renamed from: u, reason: collision with root package name */
    public final int f10328u;

    /* renamed from: v, reason: collision with root package name */
    public final String f10329v;

    /* renamed from: w, reason: collision with root package name */
    public final C0831kn f10330w;

    /* renamed from: x, reason: collision with root package name */
    public final C0831kn f10331x;
    public HttpURLConnection y;

    /* renamed from: z, reason: collision with root package name */
    public InputStream f10332z;

    public C1071qB(String str, int i4, int i5, boolean z4, C0831kn c0831kn) {
        super(true);
        this.f10329v = str;
        this.f10327t = i4;
        this.f10328u = i5;
        this.f10326s = z4;
        this.f10330w = c0831kn;
        this.f10331x = new C0831kn(4);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1398xw, com.google.android.gms.internal.ads.Px
    public final Map a() {
        HttpURLConnection httpURLConnection = this.y;
        return httpURLConnection == null ? Lt.f6175u : new PA(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final Uri e() {
        HttpURLConnection httpURLConnection = this.y;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.HttpURLConnection h(java.net.URL r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) {
        /*
            r4 = this;
            java.net.URLConnection r5 = r5.openConnection()
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5
            int r0 = r4.f10327t
            r5.setConnectTimeout(r0)
            int r0 = r4.f10328u
            r5.setReadTimeout(r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.kn r1 = r4.f10330w
            java.util.Map r1 = r1.z()
            r0.putAll(r1)
            com.google.android.gms.internal.ads.kn r1 = r4.f10331x
            java.util.Map r1 = r1.z()
            r0.putAll(r1)
            r0.putAll(r12)
            java.util.Set r12 = r0.entrySet()
            java.util.Iterator r12 = r12.iterator()
        L32:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L4e
            java.lang.Object r0 = r12.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.setRequestProperty(r1, r0)
            goto L32
        L4e:
            r0 = 0
            int r12 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = -1
            if (r12 != 0) goto L5d
            int r6 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r6 != 0) goto L5c
            r6 = 0
            goto L79
        L5c:
            r6 = r0
        L5d:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r0 = "bytes="
            r12.<init>(r0)
            r12.append(r6)
            java.lang.String r0 = "-"
            r12.append(r0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L75
            long r6 = r6 + r8
            long r6 = r6 + r2
            r12.append(r6)
        L75:
            java.lang.String r6 = r12.toString()
        L79:
            if (r6 == 0) goto L80
            java.lang.String r7 = "Range"
            r5.setRequestProperty(r7, r6)
        L80:
            java.lang.String r6 = r4.f10329v
            if (r6 == 0) goto L89
            java.lang.String r7 = "User-Agent"
            r5.setRequestProperty(r7, r6)
        L89:
            r6 = 1
            if (r6 == r10) goto L8f
            java.lang.String r6 = "identity"
            goto L91
        L8f:
            java.lang.String r6 = "gzip"
        L91:
            java.lang.String r7 = "Accept-Encoding"
            r5.setRequestProperty(r7, r6)
            r5.setInstanceFollowRedirects(r11)
            r6 = 0
            r5.setDoOutput(r6)
            int r6 = com.google.android.gms.internal.ads.C0757iz.f9103g
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)
            r5.connect()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1071qB.h(java.net.URL, long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    @Override // com.google.android.gms.internal.ads.Px
    public final void i() {
        try {
            InputStream inputStream = this.f10332z;
            if (inputStream != null) {
                long j4 = this.f10324C;
                long j5 = j4 == -1 ? -1L : j4 - this.f10325D;
                HttpURLConnection httpURLConnection = this.y;
                try {
                    if (httpURLConnection != null) {
                        if (AbstractC0751is.f9071a <= 20) {
                            try {
                                InputStream inputStream2 = httpURLConnection.getInputStream();
                                if (j5 == -1) {
                                    if (inputStream2.read() != -1) {
                                    }
                                } else if (j5 <= 2048) {
                                }
                                String name = inputStream2.getClass().getName();
                                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                                    Class<? super Object> superclass = inputStream2.getClass().getSuperclass();
                                    if (superclass == null) {
                                        throw null;
                                    }
                                    Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", null);
                                    declaredMethod.setAccessible(true);
                                    declaredMethod.invoke(inputStream2, null);
                                }
                            } catch (Exception unused) {
                            }
                        }
                        inputStream.close();
                    }
                    inputStream.close();
                } catch (IOException e4) {
                    int i4 = AbstractC0751is.f9071a;
                    throw new JB(e4, 2000, 3);
                }
            }
            this.f10332z = null;
            l();
            if (this.f10322A) {
                this.f10322A = false;
                c();
            }
        } catch (Throwable th) {
            this.f10332z = null;
            l();
            if (this.f10322A) {
                this.f10322A = false;
                c();
            }
            throw th;
        }
    }

    public final URL k(URL url, String str) {
        if (str == null) {
            throw new JB(2001, 1, "Null location redirect");
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new JB(2001, 1, "Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
            }
            if (this.f10326s || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new JB(2001, 1, "Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")");
        } catch (MalformedURLException e4) {
            throw new JB(e4, 2001, 1);
        }
    }

    public final void l() {
        HttpURLConnection httpURLConnection = this.y;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e4) {
                Wj.i("DefaultHttpDataSource", "Unexpected error while disconnecting", e4);
            }
            this.y = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018f A[Catch: IOException -> 0x019a, TRY_LEAVE, TryCatch #2 {IOException -> 0x019a, blocks: (B:24:0x0187, B:26:0x018f), top: B:23:0x0187 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017c  */
    @Override // com.google.android.gms.internal.ads.Px
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long o(com.google.android.gms.internal.ads.C0757iz r31) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C1071qB.o(com.google.android.gms.internal.ads.iz):long");
    }

    @Override // com.google.android.gms.internal.ads.ZD
    public final int r(byte[] bArr, int i4, int i5) {
        if (i5 == 0) {
            return 0;
        }
        try {
            long j4 = this.f10324C;
            if (j4 != -1) {
                long j5 = j4 - this.f10325D;
                if (j5 == 0) {
                    return -1;
                }
                i5 = (int) Math.min(i5, j5);
            }
            InputStream inputStream = this.f10332z;
            int i6 = AbstractC0751is.f9071a;
            int read = inputStream.read(bArr, i4, i5);
            if (read != -1) {
                this.f10325D += read;
                v(read);
                return read;
            }
            return -1;
        } catch (IOException e4) {
            int i7 = AbstractC0751is.f9071a;
            throw JB.a(e4, 2);
        }
    }
}
