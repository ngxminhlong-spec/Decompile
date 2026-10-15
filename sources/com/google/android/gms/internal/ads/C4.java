package com.google.android.gms.internal.ads;

import O1.C0081p;
import com.google.android.gms.internal.measurement.C1510e1;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class C4 implements InterfaceC1457zB {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4400a;

    public /* synthetic */ C4(int i4) {
        this.f4400a = i4;
    }

    public /* synthetic */ C4(int i4, boolean z4) {
        this.f4400a = i4;
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [com.google.android.gms.internal.ads.vh, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.FB
    public final Object c() {
        switch (this.f4400a) {
            case 0:
                return new Object();
            case 1:
                return new Object();
            case 2:
                return N1.n.f1204A.f1209g;
            case 3:
                String str = C0081p.f1374f.c;
                AbstractC0587ez.n(str);
                return str;
            case 4:
                return new ArrayDeque();
            case 5:
                return C1510e1.w();
            case 6:
                return new C1016p(9);
            case 7:
                return new C1016p(20);
            case 8:
                return new C1016p(23);
            case 9:
                return N1.n.f1204A.f1225w;
            case 10:
                return new Object();
            case 11:
                return EnumC0807k5.f9272z;
            case 12:
                return "app_open_ad";
            case 13:
                return EnumC0807k5.f9264q;
            case 14:
                return "banner";
            case 15:
                return new C1082qg();
            case 16:
                return new C1040ph();
            case 17:
                ?? obj = new Object();
                obj.f11046o = ((Integer) O1.r.d.c.a(AbstractC1066q6.f10175V0)).intValue();
                return obj;
            case 18:
                Set set = Collections.EMPTY_SET;
                AbstractC0587ez.n(set);
                return set;
            case 19:
                Set set2 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set2);
                return set2;
            case 20:
                Set set3 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set3);
                return set3;
            case 21:
                Set set4 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set4);
                return set4;
            case 22:
                Set set5 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set5);
                return set5;
            case 23:
                Set set6 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set6);
                return set6;
            case 24:
                Set set7 = Collections.EMPTY_SET;
                AbstractC0587ez.n(set7);
                return set7;
            case 25:
                return new Object();
            case 26:
                return EnumC0807k5.f9266s;
            case 27:
                return "interstitial";
            case 28:
                return EnumC0807k5.f9269v;
            default:
                return "native";
        }
    }
}
