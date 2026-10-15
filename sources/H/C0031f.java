package H;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: H.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0031f {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f821a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f822b;
    public final ViewGroup c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f823e;

    public C0031f(ViewGroup viewGroup) {
        this.c = viewGroup;
    }

    public final boolean a(float f4, float f5, boolean z4) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedFling(this.c, f4, f5, z4);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedFling", e5);
            }
        }
        return false;
    }

    public final boolean b(float f4, float f5) {
        ViewParent e4;
        if (this.d && (e4 = e(0)) != null) {
            try {
                return e4.onNestedPreFling(this.c, f4, f5);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreFling", e5);
            }
        }
        return false;
    }

    public final boolean c(int i4, int i5, int i6, int[] iArr, int[] iArr2) {
        ViewParent e4;
        int i7;
        int i8;
        int[] iArr3;
        if (!this.d || (e4 = e(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            if (this.f823e == null) {
                this.f823e = new int[2];
            }
            iArr3 = this.f823e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (e4 instanceof InterfaceC0032g) {
            ((InterfaceC0032g) e4).c(viewGroup, i4, i5, iArr3, i6);
        } else if (i6 == 0) {
            try {
                e4.onNestedPreScroll(viewGroup, i4, i5, iArr3);
            } catch (AbstractMethodError e5) {
                Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedPreScroll", e5);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public final boolean d(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent e4;
        int i9;
        int i10;
        int[] iArr3;
        if (this.d && (e4 = e(i8)) != null) {
            if (i4 != 0 || i5 != 0 || i6 != 0 || i7 != 0) {
                ViewGroup viewGroup = this.c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i9 = iArr[0];
                    i10 = iArr[1];
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                if (iArr2 == null) {
                    if (this.f823e == null) {
                        this.f823e = new int[2];
                    }
                    int[] iArr4 = this.f823e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (e4 instanceof InterfaceC0033h) {
                    ((InterfaceC0033h) e4).d(viewGroup, i4, i5, i6, i7, i8, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i6;
                    iArr3[1] = iArr3[1] + i7;
                    if (e4 instanceof InterfaceC0032g) {
                        ((InterfaceC0032g) e4).e(viewGroup, i4, i5, i6, i7, i8);
                    } else if (i8 == 0) {
                        try {
                            e4.onNestedScroll(viewGroup, i4, i5, i6, i7);
                        } catch (AbstractMethodError e5) {
                            Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onNestedScroll", e5);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i9;
                    iArr[1] = iArr[1] - i10;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    public final ViewParent e(int i4) {
        if (i4 == 0) {
            return this.f821a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f822b;
    }

    public final boolean f(int i4) {
        return e(i4) != null;
    }

    public final boolean g(int i4, int i5) {
        boolean onStartNestedScroll;
        if (!f(i5)) {
            if (this.d) {
                View view = this.c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z4 = parent instanceof InterfaceC0032g;
                    if (z4) {
                        onStartNestedScroll = ((InterfaceC0032g) parent).f(view2, view, i4, i5);
                    } else {
                        if (i5 == 0) {
                            try {
                                onStartNestedScroll = parent.onStartNestedScroll(view2, view, i4);
                            } catch (AbstractMethodError e4) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e4);
                            }
                        }
                        onStartNestedScroll = false;
                    }
                    if (onStartNestedScroll) {
                        if (i5 == 0) {
                            this.f821a = parent;
                        } else if (i5 == 1) {
                            this.f822b = parent;
                        }
                        if (z4) {
                            ((InterfaceC0032g) parent).a(view2, view, i4, i5);
                        } else if (i5 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i4);
                            } catch (AbstractMethodError e5) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e5);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void h(int i4) {
        ViewParent e4 = e(i4);
        if (e4 != null) {
            boolean z4 = e4 instanceof InterfaceC0032g;
            ViewGroup viewGroup = this.c;
            if (z4) {
                ((InterfaceC0032g) e4).b(viewGroup, i4);
            } else if (i4 == 0) {
                try {
                    e4.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e5) {
                    Log.e("ViewParentCompat", "ViewParent " + e4 + " does not implement interface method onStopNestedScroll", e5);
                }
            }
            if (i4 == 0) {
                this.f821a = null;
            } else {
                if (i4 != 1) {
                    return;
                }
                this.f822b = null;
            }
        }
    }
}
