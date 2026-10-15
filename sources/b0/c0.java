package b0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: s, reason: collision with root package name */
    public static final List f3243s = Collections.EMPTY_LIST;

    /* renamed from: a, reason: collision with root package name */
    public final View f3244a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference f3245b;

    /* renamed from: j, reason: collision with root package name */
    public int f3251j;

    /* renamed from: r, reason: collision with root package name */
    public RecyclerView f3259r;
    public int c = -1;
    public int d = -1;

    /* renamed from: e, reason: collision with root package name */
    public long f3246e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f3247f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f3248g = -1;

    /* renamed from: h, reason: collision with root package name */
    public c0 f3249h = null;

    /* renamed from: i, reason: collision with root package name */
    public c0 f3250i = null;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f3252k = null;

    /* renamed from: l, reason: collision with root package name */
    public List f3253l = null;

    /* renamed from: m, reason: collision with root package name */
    public int f3254m = 0;

    /* renamed from: n, reason: collision with root package name */
    public C0185T f3255n = null;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3256o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f3257p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f3258q = -1;

    public c0(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3244a = view;
    }

    public final void a(int i4) {
        this.f3251j = i4 | this.f3251j;
    }

    public final int b() {
        RecyclerView recyclerView = this.f3259r;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.G(this);
    }

    public final int c() {
        int i4 = this.f3248g;
        return i4 == -1 ? this.c : i4;
    }

    public final List d() {
        ArrayList arrayList;
        return ((this.f3251j & 1024) != 0 || (arrayList = this.f3252k) == null || arrayList.size() == 0) ? f3243s : this.f3253l;
    }

    public final boolean e() {
        View view = this.f3244a;
        return (view.getParent() == null || view.getParent() == this.f3259r) ? false : true;
    }

    public final boolean f() {
        return (this.f3251j & 1) != 0;
    }

    public final boolean g() {
        return (this.f3251j & 4) != 0;
    }

    public final boolean h() {
        if ((this.f3251j & 16) != 0) {
            return false;
        }
        WeakHashMap weakHashMap = H.A.f779a;
        return !this.f3244a.hasTransientState();
    }

    public final boolean i() {
        return (this.f3251j & 8) != 0;
    }

    public final boolean j() {
        return this.f3255n != null;
    }

    public final boolean k() {
        return (this.f3251j & 256) != 0;
    }

    public final boolean l() {
        return (this.f3251j & 2) != 0;
    }

    public final void m(int i4, boolean z4) {
        if (this.d == -1) {
            this.d = this.c;
        }
        if (this.f3248g == -1) {
            this.f3248g = this.c;
        }
        if (z4) {
            this.f3248g += i4;
        }
        this.c += i4;
        View view = this.f3244a;
        if (view.getLayoutParams() != null) {
            ((C0179M) view.getLayoutParams()).c = true;
        }
    }

    public final void n() {
        this.f3251j = 0;
        this.c = -1;
        this.d = -1;
        this.f3246e = -1L;
        this.f3248g = -1;
        this.f3254m = 0;
        this.f3249h = null;
        this.f3250i = null;
        ArrayList arrayList = this.f3252k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f3251j &= -1025;
        this.f3257p = 0;
        this.f3258q = -1;
        RecyclerView.j(this);
    }

    public final void o(boolean z4) {
        int i4 = this.f3254m;
        int i5 = z4 ? i4 - 1 : i4 + 1;
        this.f3254m = i5;
        if (i5 < 0) {
            this.f3254m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z4 && i5 == 1) {
            this.f3251j |= 16;
        } else if (z4 && i5 == 0) {
            this.f3251j &= -17;
        }
    }

    public final boolean p() {
        return (this.f3251j & 128) != 0;
    }

    public final boolean q() {
        return (this.f3251j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.c + " id=" + this.f3246e + ", oldPos=" + this.d + ", pLpos:" + this.f3248g);
        if (j()) {
            sb.append(" scrap ");
            sb.append(this.f3256o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (g()) {
            sb.append(" invalid");
        }
        if (!f()) {
            sb.append(" unbound");
        }
        if ((this.f3251j & 2) != 0) {
            sb.append(" update");
        }
        if (i()) {
            sb.append(" removed");
        }
        if (p()) {
            sb.append(" ignored");
        }
        if (k()) {
            sb.append(" tmpDetached");
        }
        if (!h()) {
            sb.append(" not recyclable(" + this.f3254m + ")");
        }
        if ((this.f3251j & 512) != 0 || g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3244a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
