package n3;

import com.google.android.gms.internal.ads.C0574em;
import com.google.android.gms.internal.play_billing.B;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1814a {

    /* renamed from: a, reason: collision with root package name */
    public final String f14112a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f14113b;
    public final Set c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f14114e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC1817d f14115f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f14116g;

    public C1814a(String str, Set set, Set set2, int i4, int i5, InterfaceC1817d interfaceC1817d, Set set3) {
        this.f14112a = str;
        this.f14113b = Collections.unmodifiableSet(set);
        this.c = Collections.unmodifiableSet(set2);
        this.d = i4;
        this.f14114e = i5;
        this.f14115f = interfaceC1817d;
        this.f14116g = Collections.unmodifiableSet(set3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.internal.ads.em, java.lang.Object] */
    public static C0574em a(q qVar) {
        q[] qVarArr = new q[0];
        ?? obj = new Object();
        obj.f8636a = null;
        HashSet hashSet = new HashSet();
        obj.d = hashSet;
        obj.f8638e = new HashSet();
        obj.f8637b = 0;
        obj.c = 0;
        obj.f8640g = new HashSet();
        hashSet.add(qVar);
        for (q qVar2 : qVarArr) {
            B.g(qVar2, "Null interface");
        }
        Collections.addAll((HashSet) obj.d, qVarArr);
        return obj;
    }

    public static C1814a b(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            B.g(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new C1814a(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new C1.g(7, obj), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f14113b.toArray()) + ">{" + this.d + ", type=" + this.f14114e + ", deps=" + Arrays.toString(this.c.toArray()) + "}";
    }
}
