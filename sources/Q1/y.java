package Q1;

import android.content.Context;
import com.google.android.gms.internal.ads.C0242Ac;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class y extends AbstractC0115n {

    /* renamed from: b, reason: collision with root package name */
    public final C0242Ac f1735b;
    public final String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, String str, String str2) {
        super(0);
        String u2 = N1.n.f1204A.c.u(context, str);
        this.f1735b = new C0242Ac(u2);
        this.c = str2;
    }

    @Override // Q1.AbstractC0115n
    public final void e() {
        this.f1735b.o(this.c);
    }
}
