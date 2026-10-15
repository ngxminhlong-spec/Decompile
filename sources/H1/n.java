package H1;

import O1.InterfaceC0084q0;
import O1.Z0;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0084q0 f878a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f879b = new ArrayList();
    public final h c;

    public n(InterfaceC0084q0 interfaceC0084q0) {
        this.f878a = interfaceC0084q0;
        if (interfaceC0084q0 != null) {
            try {
                List<Z0> j4 = interfaceC0084q0.j();
                if (j4 != null) {
                    for (Z0 z02 : j4) {
                        h hVar = z02 != null ? new h(z02) : null;
                        if (hVar != null) {
                            this.f879b.add(hVar);
                        }
                    }
                }
            } catch (RemoteException e4) {
                Y9.q("Could not forward getAdapterResponseInfo to ResponseInfo.", e4);
            }
        }
        InterfaceC0084q0 interfaceC0084q02 = this.f878a;
        if (interfaceC0084q02 == null) {
            return;
        }
        try {
            Z0 d = interfaceC0084q02.d();
            if (d != null) {
                this.c = new h(d);
            }
        } catch (RemoteException e5) {
            Y9.q("Could not forward getLoadedAdapterResponse to ResponseInfo.", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[LOOP:0: B:12:0x0047->B:13:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject a() {
        /*
            r7 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r1 = 0
            O1.q0 r2 = r7.f878a
            if (r2 == 0) goto L15
            java.lang.String r3 = r2.g()     // Catch: android.os.RemoteException -> Lf
            goto L16
        Lf:
            r3 = move-exception
            java.lang.String r4 = "Could not forward getResponseId to ResponseInfo."
            com.google.android.gms.internal.ads.Y9.q(r4, r3)
        L15:
            r3 = r1
        L16:
            java.lang.String r4 = "null"
            java.lang.String r5 = "Response ID"
            if (r3 != 0) goto L20
            r0.put(r5, r4)
            goto L23
        L20:
            r0.put(r5, r3)
        L23:
            if (r2 == 0) goto L30
            java.lang.String r1 = r2.h()     // Catch: android.os.RemoteException -> L2a
            goto L30
        L2a:
            r3 = move-exception
            java.lang.String r5 = "Could not forward getMediationAdapterClassName to ResponseInfo."
            com.google.android.gms.internal.ads.Y9.q(r5, r3)
        L30:
            java.lang.String r3 = "Mediation Adapter Class Name"
            if (r1 != 0) goto L38
            r0.put(r3, r4)
            goto L3b
        L38:
            r0.put(r3, r1)
        L3b:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
            java.util.ArrayList r3 = r7.f879b
            int r4 = r3.size()
            r5 = 0
        L47:
            if (r5 >= r4) goto L59
            java.lang.Object r6 = r3.get(r5)
            int r5 = r5 + 1
            H1.h r6 = (H1.h) r6
            org.json.JSONObject r6 = r6.a()
            r1.put(r6)
            goto L47
        L59:
            java.lang.String r3 = "Adapter Responses"
            r0.put(r3, r1)
            H1.h r1 = r7.c
            if (r1 == 0) goto L6b
            java.lang.String r3 = "Loaded Adapter Response"
            org.json.JSONObject r1 = r1.a()
            r0.put(r3, r1)
        L6b:
            if (r2 == 0) goto L78
            android.os.Bundle r1 = r2.a()     // Catch: android.os.RemoteException -> L72
            goto L7d
        L72:
            r1 = move-exception
            java.lang.String r2 = "Could not forward getResponseExtras to ResponseInfo."
            com.google.android.gms.internal.ads.Y9.q(r2, r1)
        L78:
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L7d:
            if (r1 == 0) goto L8c
            O1.p r2 = O1.C0081p.f1374f
            com.google.android.gms.internal.ads.wc r2 = r2.f1375a
            org.json.JSONObject r1 = r2.f(r1)
            java.lang.String r2 = "Response Extras"
            r0.put(r2, r1)
        L8c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.n.a():org.json.JSONObject");
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
