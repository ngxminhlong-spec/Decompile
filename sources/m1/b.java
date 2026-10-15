package m1;

import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f13984a;

    /* renamed from: b, reason: collision with root package name */
    public String f13985b;
    public float c;
    public final ArrayList d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13986e;

    /* renamed from: f, reason: collision with root package name */
    public int f13987f;

    public b(int i4, String str, float f4, ArrayList arrayList, boolean z4, int i5) {
        this.f13984a = i4;
        this.f13985b = str;
        this.c = f4;
        this.d = arrayList;
        this.f13986e = z4;
        this.f13987f = i5;
    }

    public final b a() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList2.get(i4);
            i4++;
            c cVar = (c) obj;
            cVar.getClass();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = cVar.f13990e;
            int size2 = arrayList4.size();
            int i5 = 0;
            while (i5 < size2) {
                Object obj2 = arrayList4.get(i5);
                i5++;
                arrayList3.add((Integer) obj2);
            }
            arrayList.add(new c(cVar.f13988a, cVar.f13989b, cVar.c, cVar.d, arrayList3));
        }
        return new b(this.f13984a, this.f13985b, this.c, arrayList, this.f13986e, this.f13987f);
    }
}
