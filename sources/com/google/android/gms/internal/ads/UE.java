package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final /* synthetic */ class UE implements Comparator {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ UE f7154p = new UE(0);

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ UE f7155q = new UE(1);

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ UE f7156r = new UE(2);

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ UE f7157s = new UE(3);

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ UE f7158t = new UE(4);

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ UE f7159u = new UE(5);

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ UE f7160v = new UE(6);

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ UE f7161w = new UE(7);

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ UE f7162x = new UE(8);
    public static final /* synthetic */ UE y = new UE(9);

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f7163o;

    public /* synthetic */ UE(int i4) {
        this.f7163o = i4;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i4 = this.f7163o;
        C0710ht c0710ht = AbstractC0837kt.f9329a;
        switch (i4) {
            case 0:
                return ((C0976o2) obj2).f9809g - ((C0976o2) obj).f9809g;
            case 1:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                Ft ft = C0604fF.f8695j;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 2:
                Ft ft2 = C0604fF.f8695j;
                return 0;
            case 3:
                return ((WE) Collections.max((List) obj)).compareTo((WE) Collections.max((List) obj2));
            case 4:
                List list = (List) obj;
                List list2 = (List) obj2;
                UE ue = f7160v;
                AbstractC0837kt b4 = C0710ht.f(ue.compare((C0561eF) Collections.max(list, ue), (C0561eF) Collections.max(list2, ue))).b(list.size(), list2.size());
                UE ue2 = f7161w;
                return b4.c((C0561eF) Collections.max(list, ue2), (C0561eF) Collections.max(list2, ue2), ue2).a();
            case 5:
                return ((C0434bF) ((List) obj).get(0)).compareTo((C0434bF) ((List) obj2).get(0));
            case 6:
                C0561eF c0561eF = (C0561eF) obj;
                C0561eF c0561eF2 = (C0561eF) obj2;
                AbstractC0837kt c = c0710ht.d(c0561eF.f8605v, c0561eF2.f8605v).b(c0561eF.f8608z, c0561eF2.f8608z).d(true, true).d(c0561eF.f8602s, c0561eF2.f8602s).d(c0561eF.f8604u, c0561eF2.f8604u).c(Integer.valueOf(c0561eF.y), Integer.valueOf(c0561eF2.y), Et.f4955q);
                boolean z4 = c0561eF.f8599B;
                AbstractC0837kt d = c.d(z4, c0561eF2.f8599B);
                boolean z5 = c0561eF.f8600C;
                AbstractC0837kt d4 = d.d(z5, c0561eF2.f8600C);
                if (z4 && z5) {
                    d4 = d4.b(c0561eF.f8601D, c0561eF2.f8601D);
                }
                return d4.a();
            case 7:
                C0561eF c0561eF3 = (C0561eF) obj;
                C0561eF c0561eF4 = (C0561eF) obj2;
                boolean z6 = c0561eF3.f8602s;
                int i5 = c0561eF3.f8606w;
                Ft a4 = (z6 && c0561eF3.f8605v) ? C0604fF.f8695j : C0604fF.f8695j.a();
                Integer valueOf = Integer.valueOf(i5);
                Integer valueOf2 = Integer.valueOf(c0561eF4.f8606w);
                c0561eF3.f8603t.getClass();
                return c0710ht.c(valueOf, valueOf2, C0604fF.f8696k).c(Integer.valueOf(c0561eF3.f8607x), Integer.valueOf(c0561eF4.f8607x), a4).c(Integer.valueOf(i5), Integer.valueOf(c0561eF4.f8606w), a4).a();
            case 8:
                return ((C1289vF) obj).f11028a - ((C1289vF) obj2).f11028a;
            case 9:
                return Float.compare(((C1289vF) obj).c, ((C1289vF) obj2).c);
            case 10:
                return ((byte[]) obj).length - ((byte[]) obj2).length;
            case 11:
                L4 l4 = (L4) obj;
                L4 l42 = (L4) obj2;
                int i6 = l4.c - l42.c;
                return i6 != 0 ? i6 : (l4.f6121a > l42.f6121a ? 1 : (l4.f6121a == l42.f6121a ? 0 : -1));
            default:
                J4 j4 = (J4) obj;
                J4 j42 = (J4) obj2;
                float f4 = j4.f5783b;
                float f5 = j42.f5783b;
                if (f4 < f5) {
                    return -1;
                }
                if (f4 <= f5) {
                    float f6 = j4.f5782a;
                    float f7 = j42.f5782a;
                    if (f6 < f7) {
                        return -1;
                    }
                    if (f6 <= f7) {
                        float f8 = (j4.d - f4) * (j4.c - f6);
                        float f9 = (j42.d - f5) * (j42.c - f7);
                        if (f8 > f9) {
                            return -1;
                        }
                        if (f8 >= f9) {
                            return 0;
                        }
                    }
                }
                return 1;
        }
    }
}
