package e2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.google.android.gms.internal.ads.InterfaceC1405y2;
import h2.y;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class i implements InterfaceC1405y2 {

    /* renamed from: q, reason: collision with root package name */
    public static i f12757q;

    /* renamed from: o, reason: collision with root package name */
    public final Context f12758o;

    /* renamed from: p, reason: collision with root package name */
    public volatile Object f12759p;

    public i(Context context, int i4) {
        switch (i4) {
            case 1:
                this.f12758o = context;
                return;
            default:
                this.f12758o = context.getApplicationContext();
                return;
        }
    }

    public static i a(Context context) {
        y.i(context);
        synchronized (i.class) {
            try {
                if (f12757q == null) {
                    r.a(context);
                    f12757q = new i(context, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f12757q;
    }

    public static final o d(PackageInfo packageInfo, o... oVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            p pVar = new p(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < oVarArr.length; i4++) {
                if (oVarArr[i4].equals(pVar)) {
                    return oVarArr[i4];
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0047 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean e(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L27
            if (r4 == 0) goto L29
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L27
        L1a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L20
        L1e:
            r5 = r1
            goto L27
        L20:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L1e
            r5 = r0
        L27:
            r2 = r4
            goto L2a
        L29:
            r2 = 0
        L2a:
            if (r4 == 0) goto L48
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L48
            if (r5 == 0) goto L39
            e2.o[] r4 = e2.q.f12772a
            e2.o r4 = d(r2, r4)
            goto L45
        L39:
            e2.o[] r4 = e2.q.f12772a
            r4 = r4[r1]
            e2.o[] r5 = new e2.o[r0]
            r5[r1] = r4
            e2.o r4 = d(r2, r5)
        L45:
            if (r4 == 0) goto L48
            return r0
        L48:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.i.e(android.content.pm.PackageInfo, boolean):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01d2 A[LOOP:0: B:6:0x001a->B:12:0x01d2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01e5 A[EDGE_INSN: B:13:0x01e5->B:14:0x01e5 BREAK  A[LOOP:0: B:6:0x001a->B:12:0x01d2], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(int r18) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.i.b(int):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0121  */
    @Override // com.google.android.gms.internal.ads.InterfaceC1405y2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.gms.internal.ads.B2 c(com.google.android.gms.internal.ads.D2 r18) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.i.c(com.google.android.gms.internal.ads.D2):com.google.android.gms.internal.ads.B2");
    }
}
