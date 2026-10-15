package r;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: r.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1964a implements Iterator {

    /* renamed from: o, reason: collision with root package name */
    public int f14716o;

    /* renamed from: p, reason: collision with root package name */
    public int f14717p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f14718q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f14719r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f14720s;

    public C1964a(int i4) {
        this.f14716o = i4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1964a(e eVar, int i4) {
        this(eVar.f14741q);
        this.f14719r = i4;
        switch (i4) {
            case 1:
                this.f14720s = eVar;
                this(eVar.f14741q);
                return;
            default:
                this.f14720s = eVar;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1964a(f fVar) {
        this(fVar.f14732q);
        this.f14719r = 2;
        this.f14720s = fVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f14717p < this.f14716o;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object f4;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i4 = this.f14717p;
        switch (this.f14719r) {
            case 0:
                f4 = ((e) this.f14720s).f(i4);
                break;
            case 1:
                f4 = ((e) this.f14720s).i(i4);
                break;
            default:
                f4 = ((f) this.f14720s).f14731p[i4];
                break;
        }
        this.f14717p++;
        this.f14718q = true;
        return f4;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f14718q) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i4 = this.f14717p - 1;
        this.f14717p = i4;
        switch (this.f14719r) {
            case 0:
                ((e) this.f14720s).g(i4);
                break;
            case 1:
                ((e) this.f14720s).g(i4);
                break;
            default:
                ((f) this.f14720s).g(i4);
                break;
        }
        this.f14716o--;
        this.f14718q = false;
    }
}
