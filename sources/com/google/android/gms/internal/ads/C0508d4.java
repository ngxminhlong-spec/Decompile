package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import java.io.ByteArrayInputStream;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.d4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508d4 extends AbstractCallableC0892m4 {

    /* renamed from: i, reason: collision with root package name */
    public static final M3 f8449i = new M3(8);

    /* renamed from: h, reason: collision with root package name */
    public final Context f8450h;

    public C0508d4(U3 u32, C0549e3 c0549e3, int i4, Context context) {
        super(u32, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", c0549e3, i4, 27);
        this.f8450h = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c5, code lost:
    
        r4.f11233b.equals("E");
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0029 A[Catch: all -> 0x003e, TryCatch #2 {all -> 0x003e, blocks: (B:4:0x000d, B:6:0x0017, B:8:0x001d, B:13:0x0029, B:15:0x0033, B:18:0x00d0, B:19:0x00d6, B:35:0x0041, B:37:0x0060, B:38:0x0066, B:40:0x006c, B:43:0x0074, B:48:0x0080, B:50:0x0086, B:51:0x0089, B:53:0x008f, B:55:0x0095, B:61:0x009c, B:63:0x00bb, B:68:0x00c5, B:69:0x00cd), top: B:3:0x000d }] */
    @Override // com.google.android.gms.internal.ads.AbstractCallableC0892m4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C0508d4.a():void");
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.ru, java.lang.Object, com.google.android.gms.internal.ads.Xu] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.google.android.gms.internal.ads.n4] */
    public final String c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            C0937n6 c0937n6 = AbstractC1066q6.f10190Y1;
            O1.r rVar = O1.r.d;
            byte[] b4 = W3.b((String) rVar.c.a(c0937n6));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(b4)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(W3.b((String) rVar.c.a(AbstractC1066q6.Z1)))));
            }
            Context context = this.f8450h;
            String packageName = context.getPackageName();
            this.f9560a.getClass();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals("S")) {
                return null;
            }
            final ?? obj = new Object();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.n4
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    Xu xu = Xu.this;
                    if (list == null) {
                        xu.f(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            ApkChecksum c = A.f.c(list.get(i4));
                            type = c.getType();
                            if (type == 8) {
                                value = c.getValue();
                                char[] cArr = W3.f7341a;
                                int length = value.length;
                                char[] cArr2 = new char[length + length];
                                for (int i5 = 0; i5 < value.length; i5++) {
                                    byte b5 = value[i5];
                                    char[] cArr3 = W3.f7341a;
                                    int i6 = i5 + i5;
                                    cArr2[i6] = cArr3[(b5 & 255) >>> 4];
                                    cArr2[i6 + 1] = cArr3[b5 & 15];
                                }
                                xu.f(new String(cArr2));
                                return;
                            }
                        }
                        xu.f(null);
                    } catch (Throwable unused) {
                        xu.f(null);
                    }
                }
            });
            return (String) obj.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }
}
