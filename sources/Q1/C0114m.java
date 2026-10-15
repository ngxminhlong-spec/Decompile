package Q1;

import O1.C0081p;
import android.content.Context;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.B2;
import com.google.android.gms.internal.ads.C0874ln;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.D2;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0114m extends C0874ln {

    /* renamed from: s, reason: collision with root package name */
    public final Context f1718s;

    public C0114m(Context context) {
        super(7);
        this.f1718s = context;
    }

    @Override // com.google.android.gms.internal.ads.C0874ln, com.google.android.gms.internal.ads.InterfaceC1405y2
    public final B2 c(D2 d22) {
        int i4 = d22.f4572p;
        String str = d22.f4573q;
        if (i4 == 0) {
            if (Pattern.matches((String) O1.r.d.c.a(AbstractC1066q6.f10139N3), str)) {
                C1335wc c1335wc = C0081p.f1374f.f1375a;
                e2.f fVar = e2.f.f12753b;
                Context context = this.f1718s;
                if (fVar.c(context, 13400000) == 0) {
                    B2 c = new e2.i(context, 1).c(d22);
                    if (c != null) {
                        I.w("Got gmscore asset response: ".concat(String.valueOf(str)));
                        return c;
                    }
                    I.w("Failed to get gmscore asset response: ".concat(String.valueOf(str)));
                }
            }
        }
        return super.c(d22);
    }
}
