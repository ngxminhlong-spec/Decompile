package androidx.fragment.app;

import android.view.animation.DecelerateInterpolator;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152a implements p {

    /* renamed from: b, reason: collision with root package name */
    public int f2769b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f2770e;

    /* renamed from: f, reason: collision with root package name */
    public int f2771f;

    /* renamed from: g, reason: collision with root package name */
    public int f2772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2773h;

    /* renamed from: j, reason: collision with root package name */
    public String f2775j;

    /* renamed from: k, reason: collision with root package name */
    public int f2776k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f2777l;

    /* renamed from: m, reason: collision with root package name */
    public int f2778m;

    /* renamed from: n, reason: collision with root package name */
    public CharSequence f2779n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f2780o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f2781p;

    /* renamed from: r, reason: collision with root package name */
    public final s f2783r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2784s;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2768a = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final boolean f2774i = true;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2782q = false;

    /* renamed from: t, reason: collision with root package name */
    public int f2785t = -1;

    public C0152a(s sVar) {
        this.f2783r = sVar;
    }

    @Override // androidx.fragment.app.p
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        DecelerateInterpolator decelerateInterpolator = s.f2883T;
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f2773h) {
            return true;
        }
        s sVar = this.f2783r;
        if (sVar.f2908v == null) {
            sVar.f2908v = new ArrayList();
        }
        sVar.f2908v.add(this);
        return true;
    }

    public final void b(w wVar) {
        this.f2768a.add(wVar);
        wVar.c = this.f2769b;
        wVar.d = this.c;
        wVar.f2936e = this.d;
        wVar.f2937f = this.f2770e;
    }

    public final void c() {
        if (!this.f2774i) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f2773h = true;
        this.f2775j = null;
    }

    public final void d(int i4) {
        if (this.f2773h) {
            DecelerateInterpolator decelerateInterpolator = s.f2883T;
            ArrayList arrayList = this.f2768a;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = ((w) arrayList.get(i5)).f2935b;
                if (abstractComponentCallbacksC0157f != null) {
                    abstractComponentCallbacksC0157f.f2822D += i4;
                    DecelerateInterpolator decelerateInterpolator2 = s.f2883T;
                }
            }
        }
    }

    public final int e(boolean z4) {
        int size;
        if (this.f2784s) {
            throw new IllegalStateException("commit already called");
        }
        DecelerateInterpolator decelerateInterpolator = s.f2883T;
        this.f2784s = true;
        if (this.f2773h) {
            s sVar = this.f2783r;
            synchronized (sVar) {
                try {
                    ArrayList arrayList = sVar.f2885A;
                    if (arrayList != null && arrayList.size() > 0) {
                        ArrayList arrayList2 = sVar.f2885A;
                        size = ((Integer) arrayList2.remove(arrayList2.size() - 1)).intValue();
                        sVar.f2911z.set(size, this);
                    }
                    if (sVar.f2911z == null) {
                        sVar.f2911z = new ArrayList();
                    }
                    size = sVar.f2911z.size();
                    sVar.f2911z.add(this);
                } finally {
                }
            }
            this.f2785t = size;
        } else {
            this.f2785t = -1;
        }
        this.f2783r.I(this, z4);
        return this.f2785t;
    }

    public final void f(int i4, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, String str, int i5) {
        Class<?> cls = abstractComponentCallbacksC0157f.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = abstractComponentCallbacksC0157f.f2829K;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0157f + ": was " + abstractComponentCallbacksC0157f.f2829K + " now " + str);
            }
            abstractComponentCallbacksC0157f.f2829K = str;
        }
        if (i4 != 0) {
            if (i4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0157f + " with tag " + str + " to container view with no id");
            }
            int i6 = abstractComponentCallbacksC0157f.f2827I;
            if (i6 != 0 && i6 != i4) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0157f + ": was " + abstractComponentCallbacksC0157f.f2827I + " now " + i4);
            }
            abstractComponentCallbacksC0157f.f2827I = i4;
            abstractComponentCallbacksC0157f.f2828J = i4;
        }
        b(new w(i5, abstractComponentCallbacksC0157f));
        abstractComponentCallbacksC0157f.f2823E = this.f2783r;
    }

    public final void g() {
        ArrayList arrayList = this.f2768a;
        int size = arrayList.size();
        int i4 = 0;
        while (true) {
            s sVar = this.f2783r;
            if (i4 >= size) {
                if (this.f2782q) {
                    return;
                }
                sVar.X(sVar.f2887C, true);
                return;
            }
            w wVar = (w) arrayList.get(i4);
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = wVar.f2935b;
            if (abstractComponentCallbacksC0157f != null) {
                int i5 = this.f2771f;
                int i6 = this.f2772g;
                if (abstractComponentCallbacksC0157f.f2839V != null || i5 != 0 || i6 != 0) {
                    abstractComponentCallbacksC0157f.b();
                    C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
                    c0156e.f2812e = i5;
                    c0156e.f2813f = i6;
                }
            }
            switch (wVar.f2934a) {
                case 1:
                    abstractComponentCallbacksC0157f.H(wVar.c);
                    sVar.a(abstractComponentCallbacksC0157f, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + wVar.f2934a);
                case 3:
                    abstractComponentCallbacksC0157f.H(wVar.d);
                    sVar.c0(abstractComponentCallbacksC0157f);
                    break;
                case 4:
                    abstractComponentCallbacksC0157f.H(wVar.d);
                    sVar.getClass();
                    if (!abstractComponentCallbacksC0157f.f2830L) {
                        abstractComponentCallbacksC0157f.f2830L = true;
                        abstractComponentCallbacksC0157f.f2841X = !abstractComponentCallbacksC0157f.f2841X;
                        break;
                    }
                    break;
                case 5:
                    abstractComponentCallbacksC0157f.H(wVar.c);
                    sVar.getClass();
                    if (abstractComponentCallbacksC0157f.f2830L) {
                        abstractComponentCallbacksC0157f.f2830L = false;
                        abstractComponentCallbacksC0157f.f2841X = !abstractComponentCallbacksC0157f.f2841X;
                        break;
                    }
                    break;
                case 6:
                    abstractComponentCallbacksC0157f.H(wVar.d);
                    sVar.f(abstractComponentCallbacksC0157f);
                    break;
                case 7:
                    abstractComponentCallbacksC0157f.H(wVar.c);
                    sVar.c(abstractComponentCallbacksC0157f);
                    break;
                case 8:
                    sVar.k0(abstractComponentCallbacksC0157f);
                    break;
                case 9:
                    sVar.k0(null);
                    break;
                case 10:
                    sVar.j0(abstractComponentCallbacksC0157f, wVar.f2939h);
                    break;
            }
            if (!this.f2782q && wVar.f2934a != 1 && abstractComponentCallbacksC0157f != null) {
                sVar.W(abstractComponentCallbacksC0157f);
            }
            i4++;
        }
    }

    public final void h(boolean z4) {
        ArrayList arrayList = this.f2768a;
        int size = arrayList.size() - 1;
        while (true) {
            s sVar = this.f2783r;
            if (size < 0) {
                if (this.f2782q || !z4) {
                    return;
                }
                sVar.X(sVar.f2887C, true);
                return;
            }
            w wVar = (w) arrayList.get(size);
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = wVar.f2935b;
            if (abstractComponentCallbacksC0157f != null) {
                int i4 = this.f2771f;
                DecelerateInterpolator decelerateInterpolator = s.f2883T;
                int i5 = i4 != 4097 ? i4 != 4099 ? i4 != 8194 ? 0 : 4097 : 4099 : 8194;
                int i6 = this.f2772g;
                if (abstractComponentCallbacksC0157f.f2839V != null || i5 != 0 || i6 != 0) {
                    abstractComponentCallbacksC0157f.b();
                    C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
                    c0156e.f2812e = i5;
                    c0156e.f2813f = i6;
                }
            }
            switch (wVar.f2934a) {
                case 1:
                    abstractComponentCallbacksC0157f.H(wVar.f2937f);
                    sVar.c0(abstractComponentCallbacksC0157f);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + wVar.f2934a);
                case 3:
                    abstractComponentCallbacksC0157f.H(wVar.f2936e);
                    sVar.a(abstractComponentCallbacksC0157f, false);
                    break;
                case 4:
                    abstractComponentCallbacksC0157f.H(wVar.f2936e);
                    sVar.getClass();
                    if (abstractComponentCallbacksC0157f.f2830L) {
                        abstractComponentCallbacksC0157f.f2830L = false;
                        abstractComponentCallbacksC0157f.f2841X = !abstractComponentCallbacksC0157f.f2841X;
                        break;
                    }
                    break;
                case 5:
                    abstractComponentCallbacksC0157f.H(wVar.f2937f);
                    sVar.getClass();
                    if (!abstractComponentCallbacksC0157f.f2830L) {
                        abstractComponentCallbacksC0157f.f2830L = true;
                        abstractComponentCallbacksC0157f.f2841X = !abstractComponentCallbacksC0157f.f2841X;
                        break;
                    }
                    break;
                case 6:
                    abstractComponentCallbacksC0157f.H(wVar.f2936e);
                    sVar.c(abstractComponentCallbacksC0157f);
                    break;
                case 7:
                    abstractComponentCallbacksC0157f.H(wVar.f2937f);
                    sVar.f(abstractComponentCallbacksC0157f);
                    break;
                case 8:
                    sVar.k0(null);
                    break;
                case 9:
                    sVar.k0(abstractComponentCallbacksC0157f);
                    break;
                case 10:
                    sVar.j0(abstractComponentCallbacksC0157f, wVar.f2938g);
                    break;
            }
            if (!this.f2782q && wVar.f2934a != 3 && abstractComponentCallbacksC0157f != null) {
                sVar.W(abstractComponentCallbacksC0157f);
            }
            size--;
        }
    }

    public final boolean i(int i4) {
        ArrayList arrayList = this.f2768a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = ((w) arrayList.get(i5)).f2935b;
            int i6 = abstractComponentCallbacksC0157f != null ? abstractComponentCallbacksC0157f.f2828J : 0;
            if (i6 != 0 && i6 == i4) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(ArrayList arrayList, int i4, int i5) {
        if (i5 == i4) {
            return false;
        }
        ArrayList arrayList2 = this.f2768a;
        int size = arrayList2.size();
        int i6 = -1;
        for (int i7 = 0; i7 < size; i7++) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = ((w) arrayList2.get(i7)).f2935b;
            int i8 = abstractComponentCallbacksC0157f != null ? abstractComponentCallbacksC0157f.f2828J : 0;
            if (i8 != 0 && i8 != i6) {
                for (int i9 = i4; i9 < i5; i9++) {
                    C0152a c0152a = (C0152a) arrayList.get(i9);
                    int size2 = c0152a.f2768a.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = ((w) c0152a.f2768a.get(i10)).f2935b;
                        if ((abstractComponentCallbacksC0157f2 != null ? abstractComponentCallbacksC0157f2.f2828J : 0) == i8) {
                            return true;
                        }
                    }
                }
                i6 = i8;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f2785t >= 0) {
            sb.append(" #");
            sb.append(this.f2785t);
        }
        if (this.f2775j != null) {
            sb.append(" ");
            sb.append(this.f2775j);
        }
        sb.append("}");
        return sb.toString();
    }
}
