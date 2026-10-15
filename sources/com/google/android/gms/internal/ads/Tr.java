package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tr implements Closeable {

    /* renamed from: o, reason: collision with root package name */
    public Ls f7092o;

    /* renamed from: p, reason: collision with root package name */
    public C0753iv f7093p;

    /* renamed from: q, reason: collision with root package name */
    public HttpURLConnection f7094q;

    public final HttpURLConnection a(C0753iv c0753iv) {
        this.f7092o = new C0347Uc(13, (byte) 0);
        this.f7093p = c0753iv;
        ((Integer) this.f7092o.b()).getClass();
        C0753iv c0753iv2 = this.f7093p;
        c0753iv2.getClass();
        Set set = C1293vd.f11031t;
        C1016p c1016p = N1.n.f1204A.f1217o;
        int intValue = ((Integer) O1.r.d.c.a(AbstractC1066q6.f10285t)).intValue();
        URL url = new URL(c0753iv2.f9098p);
        int i4 = 0;
        while (true) {
            i4++;
            if (i4 > 20) {
                throw new IOException("Too many redirects (20)");
            }
            URLConnection openConnection = url.openConnection();
            openConnection.setConnectTimeout(intValue);
            openConnection.setReadTimeout(intValue);
            if (!(openConnection instanceof HttpURLConnection)) {
                throw new IOException("Invalid protocol.");
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            C1421yc c1421yc = new C1421yc();
            c1421yc.a(httpURLConnection, null);
            httpURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpURLConnection.getResponseCode();
            c1421yc.b(httpURLConnection, responseCode);
            if (responseCode / 100 != 3) {
                this.f7094q = httpURLConnection;
                return httpURLConnection;
            }
            String headerField = httpURLConnection.getHeaderField("Location");
            if (headerField == null) {
                throw new IOException("Missing Location header in redirect");
            }
            URL url2 = new URL(url, headerField);
            String protocol = url2.getProtocol();
            if (protocol == null) {
                throw new IOException("Protocol is null");
            }
            if (!protocol.equals("http") && !protocol.equals("https")) {
                throw new IOException("Unsupported scheme: ".concat(protocol));
            }
            Y9.m("Redirecting to ".concat(headerField));
            httpURLConnection.disconnect();
            url = url2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        HttpURLConnection httpURLConnection = this.f7094q;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
