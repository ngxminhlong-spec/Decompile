package B0;

import com.google.android.gms.internal.play_billing.AbstractC1629o;
import com.google.android.gms.internal.play_billing.C1625m;
import com.google.android.gms.internal.play_billing.EnumC1601a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f71a;

    /* renamed from: b, reason: collision with root package name */
    public int f72b;
    public String c;

    public /* synthetic */ d(int i4) {
        this.f71a = i4;
    }

    public static d b() {
        d dVar = new d(0);
        dVar.c = "";
        return dVar;
    }

    public d a() {
        d dVar = new d(1);
        dVar.f72b = this.f72b;
        dVar.c = this.c;
        return dVar;
    }

    public String toString() {
        switch (this.f71a) {
            case 1:
                int i4 = this.f72b;
                int i5 = AbstractC1629o.f12237a;
                C1625m c1625m = EnumC1601a.f12177q;
                Integer valueOf = Integer.valueOf(i4);
                return "Response Code: " + (!c1625m.containsKey(valueOf) ? EnumC1601a.f12176p : (EnumC1601a) c1625m.get(valueOf)).toString() + ", Debug Message: " + this.c;
            default:
                return super.toString();
        }
    }
}
