package W1;

import com.google.android.gms.internal.ads.AbstractC0587ez;
import com.google.android.gms.internal.ads.EnumC0807k5;
import com.google.android.gms.internal.ads.InterfaceC1457zB;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class d implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1989a;

    /* renamed from: b, reason: collision with root package name */
    public final B0.a f1990b;

    public /* synthetic */ d(B0.a aVar, int i4) {
        this.f1989a = i4;
        this.f1990b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f1989a) {
            case 0:
                String str = this.f1990b.f45b;
                switch (str.hashCode()) {
                    case -1999289321:
                        if (str.equals("NATIVE")) {
                            return EnumC0807k5.f9269v;
                        }
                        break;
                    case -1372958932:
                        if (str.equals("INTERSTITIAL")) {
                            return EnumC0807k5.f9266s;
                        }
                        break;
                    case 543046670:
                        if (str.equals("REWARDED")) {
                            return EnumC0807k5.f9270w;
                        }
                        break;
                    case 1951953708:
                        if (str.equals("BANNER")) {
                            return EnumC0807k5.f9264q;
                        }
                        break;
                }
                return EnumC0807k5.f9263p;
            case 1:
                String lowerCase = this.f1990b.f45b.toLowerCase(Locale.ROOT);
                AbstractC0587ez.n(lowerCase);
                return lowerCase;
            default:
                B0.a aVar = this.f1990b;
                aVar.getClass();
                HashSet hashSet = new HashSet();
                hashSet.add(aVar.f45b.toLowerCase(Locale.ROOT));
                return hashSet;
        }
    }
}
