package com.google.android.gms.internal.ads;

import O1.C0081p;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ac, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0242Ac implements InterfaceC1292vc {

    /* renamed from: o, reason: collision with root package name */
    public final String f3946o;

    public C0242Ac(String str) {
        this.f3946o = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1292vc
    public final boolean o(String str) {
        boolean z4 = false;
        try {
            Y9.m("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                C1335wc c1335wc = C0081p.f1374f.f1375a;
                String str2 = this.f3946o;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                C1421yc c1421yc = new C1421yc();
                c1421yc.a(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                c1421yc.b(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    z4 = true;
                    return z4;
                }
                Y9.s("Received non-success response code " + responseCode + " from pinging URL: " + str);
                return z4;
            } finally {
                httpURLConnection.disconnect();
            }
        } catch (IOException e4) {
            e = e4;
            Y9.s("Error while pinging URL: " + str + ". " + e.getMessage());
            return false;
        } catch (IndexOutOfBoundsException e5) {
            Y9.s("Error while parsing ping URL: " + str + ". " + e5.getMessage());
            return false;
        } catch (RuntimeException e6) {
            e = e6;
            Y9.s("Error while pinging URL: " + str + ". " + e.getMessage());
            return false;
        } finally {
        }
    }
}
