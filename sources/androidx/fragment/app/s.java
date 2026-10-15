package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.ScaleAnimation;
import com.google.android.gms.internal.ads.C0783ji;
import f.AbstractActivityC1671f;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class s extends AbstractC0160i implements LayoutInflater.Factory2 {

    /* renamed from: T, reason: collision with root package name */
    public static final DecelerateInterpolator f2883T = new DecelerateInterpolator(2.5f);

    /* renamed from: U, reason: collision with root package name */
    public static final DecelerateInterpolator f2884U = new DecelerateInterpolator(1.5f);

    /* renamed from: A, reason: collision with root package name */
    public ArrayList f2885A;

    /* renamed from: B, reason: collision with root package name */
    public final CopyOnWriteArrayList f2886B;

    /* renamed from: C, reason: collision with root package name */
    public int f2887C;

    /* renamed from: D, reason: collision with root package name */
    public C0158g f2888D;

    /* renamed from: E, reason: collision with root package name */
    public o f2889E;

    /* renamed from: F, reason: collision with root package name */
    public AbstractComponentCallbacksC0157f f2890F;

    /* renamed from: G, reason: collision with root package name */
    public AbstractComponentCallbacksC0157f f2891G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f2892H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2893I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f2894J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f2895K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f2896L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f2897M;
    public ArrayList N;

    /* renamed from: O, reason: collision with root package name */
    public ArrayList f2898O;

    /* renamed from: P, reason: collision with root package name */
    public Bundle f2899P;

    /* renamed from: Q, reason: collision with root package name */
    public SparseArray f2900Q;

    /* renamed from: R, reason: collision with root package name */
    public u f2901R;

    /* renamed from: S, reason: collision with root package name */
    public final D0.o f2902S;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f2903q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2904r;

    /* renamed from: s, reason: collision with root package name */
    public int f2905s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f2906t;

    /* renamed from: u, reason: collision with root package name */
    public final HashMap f2907u;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f2908v;

    /* renamed from: w, reason: collision with root package name */
    public ArrayList f2909w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.activity.f f2910x;
    public final C0161j y;

    /* renamed from: z, reason: collision with root package name */
    public ArrayList f2911z;

    public s() {
        this.f2867o = null;
        this.f2905s = 0;
        this.f2906t = new ArrayList();
        this.f2907u = new HashMap();
        this.y = new C0161j(this);
        this.f2886B = new CopyOnWriteArrayList();
        this.f2887C = 0;
        this.f2899P = null;
        this.f2900Q = null;
        this.f2902S = new D0.o(15, this);
    }

    public static boolean Q(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        abstractComponentCallbacksC0157f.getClass();
        boolean z4 = false;
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 : abstractComponentCallbacksC0157f.f2825G.f2907u.values()) {
            if (abstractComponentCallbacksC0157f2 != null) {
                z4 = Q(abstractComponentCallbacksC0157f2);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f == null) {
            return true;
        }
        s sVar = abstractComponentCallbacksC0157f.f2823E;
        return abstractComponentCallbacksC0157f == sVar.f2891G && R(sVar.f2890F);
    }

    public static C0783ji V(float f4, float f5, float f6, float f7) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f4, f5, f4, f5, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(f2883T);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f6, f7);
        alphaAnimation.setInterpolator(f2884U);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new C0783ji(animationSet);
    }

    public final boolean A() {
        if (this.f2887C >= 1) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = this.f2906t;
                if (i4 >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
                if (abstractComponentCallbacksC0157f != null && !abstractComponentCallbacksC0157f.f2830L && abstractComponentCallbacksC0157f.f2825G.A()) {
                    return true;
                }
                i4++;
            }
        }
        return false;
    }

    public final void B() {
        if (this.f2887C < 1) {
            return;
        }
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f2906t;
            if (i4 >= arrayList.size()) {
                return;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
            if (abstractComponentCallbacksC0157f != null && !abstractComponentCallbacksC0157f.f2830L) {
                abstractComponentCallbacksC0157f.f2825G.B();
            }
            i4++;
        }
    }

    public final void C(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f == null || this.f2907u.get(abstractComponentCallbacksC0157f.f2852r) != abstractComponentCallbacksC0157f) {
            return;
        }
        abstractComponentCallbacksC0157f.f2823E.getClass();
        boolean R4 = R(abstractComponentCallbacksC0157f);
        Boolean bool = abstractComponentCallbacksC0157f.f2857w;
        if (bool == null || bool.booleanValue() != R4) {
            abstractComponentCallbacksC0157f.f2857w = Boolean.valueOf(R4);
            s sVar = abstractComponentCallbacksC0157f.f2825G;
            sVar.n0();
            sVar.C(sVar.f2891G);
        }
    }

    public final void D() {
        ArrayList arrayList = this.f2906t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(size);
            if (abstractComponentCallbacksC0157f != null) {
                abstractComponentCallbacksC0157f.f2825G.D();
            }
        }
    }

    public final boolean E() {
        if (this.f2887C < 1) {
            return false;
        }
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f2906t;
            if (i4 >= arrayList.size()) {
                return z4;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
            if (abstractComponentCallbacksC0157f != null) {
                if (!abstractComponentCallbacksC0157f.f2830L ? abstractComponentCallbacksC0157f.f2825G.E() : false) {
                    z4 = true;
                }
            }
            i4++;
        }
    }

    public final void F(int i4) {
        try {
            this.f2904r = true;
            X(i4, false);
            this.f2904r = false;
            K();
        } catch (Throwable th) {
            this.f2904r = false;
            throw th;
        }
    }

    public final void G() {
        if (this.f2896L) {
            this.f2896L = false;
            l0();
        }
    }

    public final void H(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        String str2;
        int size4;
        String str3;
        String h4 = n0.a.h(str, "    ");
        if (!this.f2907u.isEmpty()) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : this.f2907u.values()) {
                printWriter.print(str);
                printWriter.println(abstractComponentCallbacksC0157f);
                if (abstractComponentCallbacksC0157f != null) {
                    abstractComponentCallbacksC0157f.getClass();
                    printWriter.print(h4);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0157f.f2827I));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0157f.f2828J));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0157f.f2829K);
                    printWriter.print(h4);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2849o);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2852r);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0157f.f2822D);
                    printWriter.print(h4);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2858x);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0157f.y);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2859z);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0157f.f2819A);
                    printWriter.print(h4);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2830L);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2831M);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0157f.f2832O);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(h4);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0157f.N);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0157f.f2838U);
                    if (abstractComponentCallbacksC0157f.f2823E != null) {
                        printWriter.print(h4);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2823E);
                    }
                    if (abstractComponentCallbacksC0157f.f2824F != null) {
                        printWriter.print(h4);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2824F);
                    }
                    if (abstractComponentCallbacksC0157f.f2826H != null) {
                        printWriter.print(h4);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2826H);
                    }
                    if (abstractComponentCallbacksC0157f.f2853s != null) {
                        printWriter.print(h4);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2853s);
                    }
                    if (abstractComponentCallbacksC0157f.f2850p != null) {
                        printWriter.print(h4);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2850p);
                    }
                    if (abstractComponentCallbacksC0157f.f2851q != null) {
                        printWriter.print(h4);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2851q);
                    }
                    Object obj = abstractComponentCallbacksC0157f.f2854t;
                    if (obj == null) {
                        s sVar = abstractComponentCallbacksC0157f.f2823E;
                        obj = (sVar == null || (str3 = abstractComponentCallbacksC0157f.f2855u) == null) ? null : (AbstractComponentCallbacksC0157f) sVar.f2907u.get(str3);
                    }
                    if (obj != null) {
                        printWriter.print(h4);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2856v);
                    }
                    C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
                    if ((c0156e == null ? 0 : c0156e.d) != 0) {
                        printWriter.print(h4);
                        printWriter.print("mNextAnim=");
                        C0156e c0156e2 = abstractComponentCallbacksC0157f.f2839V;
                        printWriter.println(c0156e2 == null ? 0 : c0156e2.d);
                    }
                    if (abstractComponentCallbacksC0157f.f2834Q != null) {
                        printWriter.print(h4);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2834Q);
                    }
                    if (abstractComponentCallbacksC0157f.f2835R != null) {
                        printWriter.print(h4);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2835R);
                    }
                    if (abstractComponentCallbacksC0157f.f2836S != null) {
                        printWriter.print(h4);
                        printWriter.print("mInnerView=");
                        printWriter.println(abstractComponentCallbacksC0157f.f2835R);
                    }
                    if (abstractComponentCallbacksC0157f.i() != null) {
                        printWriter.print(h4);
                        printWriter.print("mAnimatingAway=");
                        printWriter.println(abstractComponentCallbacksC0157f.i());
                        printWriter.print(h4);
                        printWriter.print("mStateAfterAnimating=");
                        C0156e c0156e3 = abstractComponentCallbacksC0157f.f2839V;
                        printWriter.println(c0156e3 == null ? 0 : c0156e3.c);
                    }
                    if (abstractComponentCallbacksC0157f.l() != null) {
                        r.j jVar = ((S.a) new q2.e(abstractComponentCallbacksC0157f.e(), S.a.d).l(S.a.class)).c;
                        if (jVar.f() > 0) {
                            printWriter.print(h4);
                            printWriter.println("Loaders:");
                            if (jVar.f() > 0) {
                                if (jVar.g(0) != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(h4);
                                printWriter.print("  #");
                                printWriter.print(jVar.d(0));
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(h4);
                    printWriter.println("Child " + abstractComponentCallbacksC0157f.f2825G + ":");
                    abstractComponentCallbacksC0157f.f2825G.H(n0.a.h(h4, "  "), fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size5 = this.f2906t.size();
        if (size5 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i4 = 0; i4 < size5; i4++) {
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = (AbstractComponentCallbacksC0157f) this.f2906t.get(i4);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0157f2.toString());
            }
        }
        ArrayList arrayList = this.f2909w;
        if (arrayList != null && (size4 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i5 = 0; i5 < size4; i5++) {
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f3 = (AbstractComponentCallbacksC0157f) this.f2909w.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0157f3.toString());
            }
        }
        ArrayList arrayList2 = this.f2908v;
        if (arrayList2 != null && (size3 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i6 = 0; i6 < size3; i6++) {
                C0152a c0152a = (C0152a) this.f2908v.get(i6);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i6);
                printWriter.print(": ");
                printWriter.println(c0152a.toString());
                ArrayList arrayList3 = c0152a.f2768a;
                printWriter.print(h4);
                printWriter.print("mName=");
                printWriter.print(c0152a.f2775j);
                printWriter.print(" mIndex=");
                printWriter.print(c0152a.f2785t);
                printWriter.print(" mCommitted=");
                printWriter.println(c0152a.f2784s);
                if (c0152a.f2771f != 0) {
                    printWriter.print(h4);
                    printWriter.print("mTransition=#");
                    printWriter.print(Integer.toHexString(c0152a.f2771f));
                    printWriter.print(" mTransitionStyle=#");
                    printWriter.println(Integer.toHexString(c0152a.f2772g));
                }
                if (c0152a.f2769b != 0 || c0152a.c != 0) {
                    printWriter.print(h4);
                    printWriter.print("mEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0152a.f2769b));
                    printWriter.print(" mExitAnim=#");
                    printWriter.println(Integer.toHexString(c0152a.c));
                }
                if (c0152a.d != 0 || c0152a.f2770e != 0) {
                    printWriter.print(h4);
                    printWriter.print("mPopEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0152a.d));
                    printWriter.print(" mPopExitAnim=#");
                    printWriter.println(Integer.toHexString(c0152a.f2770e));
                }
                if (c0152a.f2776k != 0 || c0152a.f2777l != null) {
                    printWriter.print(h4);
                    printWriter.print("mBreadCrumbTitleRes=#");
                    printWriter.print(Integer.toHexString(c0152a.f2776k));
                    printWriter.print(" mBreadCrumbTitleText=");
                    printWriter.println(c0152a.f2777l);
                }
                if (c0152a.f2778m != 0 || c0152a.f2779n != null) {
                    printWriter.print(h4);
                    printWriter.print("mBreadCrumbShortTitleRes=#");
                    printWriter.print(Integer.toHexString(c0152a.f2778m));
                    printWriter.print(" mBreadCrumbShortTitleText=");
                    printWriter.println(c0152a.f2779n);
                }
                if (!arrayList3.isEmpty()) {
                    printWriter.print(h4);
                    printWriter.println("Operations:");
                    int size6 = arrayList3.size();
                    for (int i7 = 0; i7 < size6; i7++) {
                        w wVar = (w) arrayList3.get(i7);
                        switch (wVar.f2934a) {
                            case 0:
                                str2 = "NULL";
                                break;
                            case 1:
                                str2 = "ADD";
                                break;
                            case 2:
                                str2 = "REPLACE";
                                break;
                            case 3:
                                str2 = "REMOVE";
                                break;
                            case 4:
                                str2 = "HIDE";
                                break;
                            case 5:
                                str2 = "SHOW";
                                break;
                            case 6:
                                str2 = "DETACH";
                                break;
                            case 7:
                                str2 = "ATTACH";
                                break;
                            case 8:
                                str2 = "SET_PRIMARY_NAV";
                                break;
                            case 9:
                                str2 = "UNSET_PRIMARY_NAV";
                                break;
                            case 10:
                                str2 = "OP_SET_MAX_LIFECYCLE";
                                break;
                            default:
                                str2 = "cmd=" + wVar.f2934a;
                                break;
                        }
                        printWriter.print(h4);
                        printWriter.print("  Op #");
                        printWriter.print(i7);
                        printWriter.print(": ");
                        printWriter.print(str2);
                        printWriter.print(" ");
                        printWriter.println(wVar.f2935b);
                        if (wVar.c != 0 || wVar.d != 0) {
                            printWriter.print(h4);
                            printWriter.print("enterAnim=#");
                            printWriter.print(Integer.toHexString(wVar.c));
                            printWriter.print(" exitAnim=#");
                            printWriter.println(Integer.toHexString(wVar.d));
                        }
                        if (wVar.f2936e != 0 || wVar.f2937f != 0) {
                            printWriter.print(h4);
                            printWriter.print("popEnterAnim=#");
                            printWriter.print(Integer.toHexString(wVar.f2936e));
                            printWriter.print(" popExitAnim=#");
                            printWriter.println(Integer.toHexString(wVar.f2937f));
                        }
                    }
                }
            }
        }
        synchronized (this) {
            try {
                ArrayList arrayList4 = this.f2911z;
                if (arrayList4 != null && (size2 = arrayList4.size()) > 0) {
                    printWriter.print(str);
                    printWriter.println("Back Stack Indices:");
                    for (int i8 = 0; i8 < size2; i8++) {
                        Object obj2 = (C0152a) this.f2911z.get(i8);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i8);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
                ArrayList arrayList5 = this.f2885A;
                if (arrayList5 != null && arrayList5.size() > 0) {
                    printWriter.print(str);
                    printWriter.print("mAvailBackStackIndices: ");
                    printWriter.println(Arrays.toString(this.f2885A.toArray()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ArrayList arrayList6 = this.f2903q;
        if (arrayList6 != null && (size = arrayList6.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i9 = 0; i9 < size; i9++) {
                Object obj3 = (p) this.f2903q.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(obj3);
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f2888D);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f2889E);
        if (this.f2890F != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f2890F);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f2887C);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f2893I);
        printWriter.print(" mStopped=");
        printWriter.print(this.f2894J);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f2895K);
        if (this.f2892H) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f2892H);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I(androidx.fragment.app.p r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L11
            boolean r0 = r1.S()
            if (r0 != 0) goto L9
            goto L11
        L9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Can not perform this action after onSaveInstanceState"
            r2.<init>(r3)
            throw r2
        L11:
            monitor-enter(r1)
            boolean r0 = r1.f2895K     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L33
            androidx.fragment.app.g r0 = r1.f2888D     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto L1b
            goto L33
        L1b:
            java.util.ArrayList r3 = r1.f2903q     // Catch: java.lang.Throwable -> L27
            if (r3 != 0) goto L29
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L27
            r3.<init>()     // Catch: java.lang.Throwable -> L27
            r1.f2903q = r3     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            java.util.ArrayList r3 = r1.f2903q     // Catch: java.lang.Throwable -> L27
            r3.add(r2)     // Catch: java.lang.Throwable -> L27
            r1.h0()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L33:
            if (r3 == 0) goto L37
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            return
        L37:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L27
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L27
            throw r2     // Catch: java.lang.Throwable -> L27
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.I(androidx.fragment.app.p, boolean):void");
    }

    public final void J(boolean z4) {
        if (this.f2904r) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f2888D == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.f2888D.f2862r.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f2897M == null) {
            this.f2897M = new ArrayList();
            this.N = new ArrayList();
        }
        this.f2904r = true;
        try {
            M(null, null);
        } finally {
            this.f2904r = false;
        }
    }

    public final boolean K() {
        boolean z4;
        J(true);
        boolean z5 = false;
        while (true) {
            ArrayList arrayList = this.f2897M;
            ArrayList arrayList2 = this.N;
            synchronized (this) {
                try {
                    ArrayList arrayList3 = this.f2903q;
                    if (arrayList3 != null && arrayList3.size() != 0) {
                        int size = this.f2903q.size();
                        z4 = false;
                        for (int i4 = 0; i4 < size; i4++) {
                            z4 |= ((p) this.f2903q.get(i4)).a(arrayList, arrayList2);
                        }
                        this.f2903q.clear();
                        this.f2888D.f2862r.removeCallbacks(this.f2902S);
                    }
                    z4 = false;
                } finally {
                }
            }
            if (!z4) {
                n0();
                G();
                this.f2907u.values().removeAll(Collections.singleton(null));
                return z5;
            }
            this.f2904r = true;
            try {
                d0(this.f2897M, this.N);
                d();
                z5 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
    }

    public final void L(ArrayList arrayList, ArrayList arrayList2, int i4, int i5) {
        ArrayList arrayList3;
        ArrayList arrayList4;
        s sVar;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        int i9;
        s sVar2 = this;
        ArrayList arrayList7 = arrayList;
        ArrayList arrayList8 = arrayList2;
        boolean z6 = ((C0152a) arrayList7.get(i4)).f2782q;
        ArrayList arrayList9 = sVar2.f2898O;
        if (arrayList9 == null) {
            sVar2.f2898O = new ArrayList();
        } else {
            arrayList9.clear();
        }
        sVar2.f2898O.addAll(sVar2.f2906t);
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = sVar2.f2891G;
        int i10 = i4;
        boolean z7 = false;
        while (true) {
            int i11 = 1;
            if (i10 >= i5) {
                boolean z8 = z6;
                sVar2.f2898O.clear();
                if (z8) {
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                } else {
                    B.j(sVar2, arrayList, arrayList2, i4, i5, false);
                    arrayList3 = arrayList;
                    arrayList4 = arrayList2;
                }
                int i12 = i4;
                while (i12 < i5) {
                    C0152a c0152a = (C0152a) arrayList3.get(i12);
                    if (((Boolean) arrayList4.get(i12)).booleanValue()) {
                        c0152a.d(-1);
                        c0152a.h(i12 == i5 + (-1));
                    } else {
                        c0152a.d(1);
                        c0152a.g();
                    }
                    i12++;
                }
                if (z8) {
                    r.f fVar = new r.f(0);
                    ArrayList arrayList10 = sVar2.f2906t;
                    int i13 = sVar2.f2887C;
                    if (i13 >= 1) {
                        int min = Math.min(i13, 3);
                        int size = arrayList10.size();
                        int i14 = 0;
                        while (i14 < size) {
                            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = (AbstractComponentCallbacksC0157f) arrayList10.get(i14);
                            if (abstractComponentCallbacksC0157f2.f2849o < min) {
                                C0156e c0156e = abstractComponentCallbacksC0157f2.f2839V;
                                i8 = i14;
                                sVar2.Y(abstractComponentCallbacksC0157f2, min, c0156e == null ? 0 : c0156e.d, c0156e == null ? 0 : c0156e.f2812e, false);
                                if (abstractComponentCallbacksC0157f2.f2835R != null && !abstractComponentCallbacksC0157f2.f2830L && abstractComponentCallbacksC0157f2.f2840W) {
                                    fVar.add(abstractComponentCallbacksC0157f2);
                                }
                            } else {
                                i8 = i14;
                            }
                            i14 = i8 + 1;
                            sVar2 = this;
                        }
                    }
                    for (int i15 = i5 - 1; i15 >= i4; i15--) {
                        C0152a c0152a2 = (C0152a) arrayList3.get(i15);
                        ((Boolean) arrayList4.get(i15)).getClass();
                        ArrayList arrayList11 = c0152a2.f2768a;
                        for (int i16 = 0; i16 < arrayList11.size(); i16++) {
                            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f3 = ((w) arrayList11.get(i16)).f2935b;
                        }
                    }
                    int i17 = fVar.f14732q;
                    for (int i18 = 0; i18 < i17; i18++) {
                        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f4 = (AbstractComponentCallbacksC0157f) fVar.f14731p[i18];
                        if (!abstractComponentCallbacksC0157f4.f2858x) {
                            View E4 = abstractComponentCallbacksC0157f4.E();
                            abstractComponentCallbacksC0157f4.f2842Y = E4.getAlpha();
                            E4.setAlpha(0.0f);
                        }
                    }
                }
                if (i5 == i4 || !z8) {
                    sVar = this;
                    arrayList5 = arrayList3;
                    arrayList6 = arrayList4;
                    i6 = i5;
                } else {
                    sVar = this;
                    arrayList5 = arrayList3;
                    arrayList6 = arrayList4;
                    i6 = i5;
                    B.j(sVar, arrayList5, arrayList6, i4, i6, true);
                    sVar.X(sVar.f2887C, true);
                }
                for (int i19 = i4; i19 < i6; i19++) {
                    C0152a c0152a3 = (C0152a) arrayList5.get(i19);
                    if (((Boolean) arrayList6.get(i19)).booleanValue() && (i7 = c0152a3.f2785t) >= 0) {
                        synchronized (this) {
                            try {
                                sVar.f2911z.set(i7, null);
                                if (sVar.f2885A == null) {
                                    sVar.f2885A = new ArrayList();
                                }
                                sVar.f2885A.add(Integer.valueOf(i7));
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        c0152a3.f2785t = -1;
                    }
                    c0152a3.getClass();
                }
                return;
            }
            C0152a c0152a4 = (C0152a) arrayList7.get(i10);
            if (((Boolean) arrayList8.get(i10)).booleanValue()) {
                z4 = z6;
                int i20 = 1;
                ArrayList arrayList12 = sVar2.f2898O;
                ArrayList arrayList13 = c0152a4.f2768a;
                int size2 = arrayList13.size() - 1;
                while (size2 >= 0) {
                    w wVar = (w) arrayList13.get(size2);
                    int i21 = wVar.f2934a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    abstractComponentCallbacksC0157f = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0157f = wVar.f2935b;
                                    break;
                                case 10:
                                    wVar.f2939h = wVar.f2938g;
                                    break;
                            }
                            size2--;
                            i20 = 1;
                        }
                        arrayList12.add(wVar.f2935b);
                        size2--;
                        i20 = 1;
                    }
                    arrayList12.remove(wVar.f2935b);
                    size2--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList14 = sVar2.f2898O;
                ArrayList arrayList15 = c0152a4.f2768a;
                int i22 = 0;
                while (i22 < arrayList15.size()) {
                    w wVar2 = (w) arrayList15.get(i22);
                    int i23 = wVar2.f2934a;
                    if (i23 != i11) {
                        int i24 = i11;
                        z5 = z6;
                        if (i23 != 2) {
                            if (i23 == 3 || i23 == 6) {
                                arrayList14.remove(wVar2.f2935b);
                                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f5 = wVar2.f2935b;
                                if (abstractComponentCallbacksC0157f5 == abstractComponentCallbacksC0157f) {
                                    arrayList15.add(i22, new w(9, abstractComponentCallbacksC0157f5));
                                    i22++;
                                    i9 = i24;
                                    abstractComponentCallbacksC0157f = null;
                                    i22 += i9;
                                    i11 = i9;
                                    z6 = z5;
                                }
                            } else if (i23 == 7) {
                                i9 = i24;
                            } else if (i23 == 8) {
                                arrayList15.add(i22, new w(9, abstractComponentCallbacksC0157f));
                                i22++;
                                abstractComponentCallbacksC0157f = wVar2.f2935b;
                            }
                            i9 = i24;
                            i22 += i9;
                            i11 = i9;
                            z6 = z5;
                        } else {
                            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f6 = wVar2.f2935b;
                            int i25 = abstractComponentCallbacksC0157f6.f2828J;
                            int size3 = arrayList14.size() - 1;
                            int i26 = 0;
                            while (size3 >= 0) {
                                int i27 = size3;
                                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f7 = (AbstractComponentCallbacksC0157f) arrayList14.get(size3);
                                if (abstractComponentCallbacksC0157f7.f2828J == i25) {
                                    if (abstractComponentCallbacksC0157f7 == abstractComponentCallbacksC0157f6) {
                                        i26 = i24;
                                    } else {
                                        if (abstractComponentCallbacksC0157f7 == abstractComponentCallbacksC0157f) {
                                            arrayList15.add(i22, new w(9, abstractComponentCallbacksC0157f7));
                                            i22++;
                                            abstractComponentCallbacksC0157f = null;
                                        }
                                        w wVar3 = new w(3, abstractComponentCallbacksC0157f7);
                                        wVar3.c = wVar2.c;
                                        wVar3.f2936e = wVar2.f2936e;
                                        wVar3.d = wVar2.d;
                                        wVar3.f2937f = wVar2.f2937f;
                                        arrayList15.add(i22, wVar3);
                                        arrayList14.remove(abstractComponentCallbacksC0157f7);
                                        i22++;
                                        size3 = i27 - 1;
                                    }
                                }
                                size3 = i27 - 1;
                            }
                            if (i26 != 0) {
                                arrayList15.remove(i22);
                                i22--;
                                i9 = i24;
                                i22 += i9;
                                i11 = i9;
                                z6 = z5;
                            } else {
                                i9 = i24;
                                wVar2.f2934a = i9;
                                arrayList14.add(abstractComponentCallbacksC0157f6);
                                i22 += i9;
                                i11 = i9;
                                z6 = z5;
                            }
                        }
                    } else {
                        z5 = z6;
                        i9 = i11;
                    }
                    arrayList14.add(wVar2.f2935b);
                    i22 += i9;
                    i11 = i9;
                    z6 = z5;
                }
                z4 = z6;
            }
            z7 = z7 || c0152a4.f2773h;
            i10++;
            arrayList7 = arrayList;
            arrayList8 = arrayList2;
            z6 = z4;
        }
    }

    public final void M(ArrayList arrayList, ArrayList arrayList2) {
    }

    public final AbstractComponentCallbacksC0157f N(int i4) {
        ArrayList arrayList = this.f2906t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(size);
            if (abstractComponentCallbacksC0157f != null && abstractComponentCallbacksC0157f.f2827I == i4) {
                return abstractComponentCallbacksC0157f;
            }
        }
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 : this.f2907u.values()) {
            if (abstractComponentCallbacksC0157f2 != null && abstractComponentCallbacksC0157f2.f2827I == i4) {
                return abstractComponentCallbacksC0157f2;
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0157f O(String str) {
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : this.f2907u.values()) {
            if (abstractComponentCallbacksC0157f != null) {
                if (!str.equals(abstractComponentCallbacksC0157f.f2852r)) {
                    abstractComponentCallbacksC0157f = abstractComponentCallbacksC0157f.f2825G.O(str);
                }
                if (abstractComponentCallbacksC0157f != null) {
                    return abstractComponentCallbacksC0157f;
                }
            }
        }
        return null;
    }

    public final C0159h P() {
        C0159h c0159h = this.f2867o;
        C0159h c0159h2 = AbstractC0160i.f2866p;
        if (c0159h == null) {
            this.f2867o = c0159h2;
        }
        if (this.f2867o == c0159h2) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
            if (abstractComponentCallbacksC0157f != null) {
                return abstractComponentCallbacksC0157f.f2823E.P();
            }
            this.f2867o = new m(this);
        }
        if (this.f2867o == null) {
            this.f2867o = c0159h2;
        }
        return this.f2867o;
    }

    public final boolean S() {
        return this.f2893I || this.f2894J;
    }

    public final C0783ji T(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, int i4, boolean z4, int i5) {
        Window window;
        C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
        int i6 = c0156e == null ? 0 : c0156e.d;
        abstractComponentCallbacksC0157f.H(0);
        ViewGroup viewGroup = abstractComponentCallbacksC0157f.f2834Q;
        if (viewGroup != null && viewGroup.getLayoutTransition() != null) {
            return null;
        }
        if (i6 != 0) {
            boolean equals = "anim".equals(this.f2888D.f2861q.getResources().getResourceTypeName(i6));
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.f2888D.f2861q, i6);
                    if (loadAnimation != null) {
                        return new C0783ji(loadAnimation);
                    }
                } catch (Resources.NotFoundException e4) {
                    throw e4;
                } catch (RuntimeException unused) {
                }
            }
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(this.f2888D.f2861q, i6);
                if (loadAnimator != null) {
                    return new C0783ji(loadAnimator);
                }
            } catch (RuntimeException e5) {
                if (equals) {
                    throw e5;
                }
                Animation loadAnimation2 = AnimationUtils.loadAnimation(this.f2888D.f2861q, i6);
                if (loadAnimation2 != null) {
                    return new C0783ji(loadAnimation2);
                }
            }
        }
        if (i4 == 0) {
            return null;
        }
        char c = i4 != 4097 ? i4 != 4099 ? i4 != 8194 ? (char) 65535 : z4 ? (char) 3 : (char) 4 : z4 ? (char) 5 : (char) 6 : z4 ? (char) 1 : (char) 2;
        if (c < 0) {
            return null;
        }
        DecelerateInterpolator decelerateInterpolator = f2884U;
        switch (c) {
            case 1:
                return V(1.125f, 1.0f, 0.0f, 1.0f);
            case 2:
                return V(1.0f, 0.975f, 1.0f, 0.0f);
            case 3:
                return V(0.975f, 1.0f, 0.0f, 1.0f);
            case 4:
                return V(1.0f, 1.075f, 1.0f, 0.0f);
            case 5:
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setInterpolator(decelerateInterpolator);
                alphaAnimation.setDuration(220L);
                return new C0783ji(alphaAnimation);
            case 6:
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setInterpolator(decelerateInterpolator);
                alphaAnimation2.setDuration(220L);
                return new C0783ji(alphaAnimation2);
            default:
                if (i5 != 0 || this.f2888D.f2864t.getWindow() == null || (window = this.f2888D.f2864t.getWindow()) == null) {
                    return null;
                }
                int i7 = window.getAttributes().windowAnimations;
                return null;
        }
    }

    public final void U(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        String str = abstractComponentCallbacksC0157f.f2852r;
        HashMap hashMap = this.f2907u;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(abstractComponentCallbacksC0157f.f2852r, abstractComponentCallbacksC0157f);
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(androidx.fragment.app.AbstractComponentCallbacksC0157f r11) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.W(androidx.fragment.app.f):void");
    }

    public final void X(int i4, boolean z4) {
        C0158g c0158g;
        if (this.f2888D == null && i4 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i4 != this.f2887C) {
            this.f2887C = i4;
            ArrayList arrayList = this.f2906t;
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                W((AbstractComponentCallbacksC0157f) arrayList.get(i5));
            }
            for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : this.f2907u.values()) {
                if (abstractComponentCallbacksC0157f != null && (abstractComponentCallbacksC0157f.y || abstractComponentCallbacksC0157f.f2831M)) {
                    if (!abstractComponentCallbacksC0157f.f2840W) {
                        W(abstractComponentCallbacksC0157f);
                    }
                }
            }
            l0();
            if (this.f2892H && (c0158g = this.f2888D) != null && this.f2887C == 4) {
                f.q qVar = (f.q) c0158g.f2864t.n();
                qVar.u();
                qVar.v(0);
                this.f2892H = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0722  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x037b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y(androidx.fragment.app.AbstractComponentCallbacksC0157f r19, int r20, int r21, int r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 1866
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.Y(androidx.fragment.app.f, int, int, int, boolean):void");
    }

    public final void Z() {
        this.f2893I = false;
        this.f2894J = false;
        ArrayList arrayList = this.f2906t;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
            if (abstractComponentCallbacksC0157f != null) {
                abstractComponentCallbacksC0157f.f2825G.Z();
            }
        }
    }

    public final void a(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, boolean z4) {
        U(abstractComponentCallbacksC0157f);
        if (abstractComponentCallbacksC0157f.f2831M) {
            return;
        }
        if (this.f2906t.contains(abstractComponentCallbacksC0157f)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0157f);
        }
        synchronized (this.f2906t) {
            this.f2906t.add(abstractComponentCallbacksC0157f);
        }
        abstractComponentCallbacksC0157f.f2858x = true;
        abstractComponentCallbacksC0157f.y = false;
        if (abstractComponentCallbacksC0157f.f2835R == null) {
            abstractComponentCallbacksC0157f.f2841X = false;
        }
        if (Q(abstractComponentCallbacksC0157f)) {
            this.f2892H = true;
        }
        if (z4) {
            Y(abstractComponentCallbacksC0157f, this.f2887C, 0, 0, false);
        }
    }

    public final boolean a0() {
        if (S()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        K();
        J(true);
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2891G;
        if (abstractComponentCallbacksC0157f != null && abstractComponentCallbacksC0157f.k().a0()) {
            return true;
        }
        boolean b02 = b0(this.f2897M, this.N, -1, 0);
        if (b02) {
            this.f2904r = true;
            try {
                d0(this.f2897M, this.N);
            } finally {
                d();
            }
        }
        n0();
        G();
        this.f2907u.values().removeAll(Collections.singleton(null));
        return b02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0158g c0158g, o oVar, AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (this.f2888D != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f2888D = c0158g;
        this.f2889E = oVar;
        this.f2890F = abstractComponentCallbacksC0157f;
        if (abstractComponentCallbacksC0157f != 0) {
            n0();
        }
        if (c0158g != null) {
            androidx.activity.f fVar = c0158g.f2864t.f2418t;
            this.f2910x = fVar;
            fVar.a(abstractComponentCallbacksC0157f != 0 ? abstractComponentCallbacksC0157f : c0158g, this.y);
        }
        if (abstractComponentCallbacksC0157f == 0) {
            if (c0158g != null) {
                this.f2901R = (u) new q2.e(c0158g.f2864t.e(), u.f2917h).l(u.class);
                return;
            } else {
                this.f2901R = new u(false);
                return;
            }
        }
        u uVar = abstractComponentCallbacksC0157f.f2823E.f2901R;
        HashMap hashMap = uVar.d;
        u uVar2 = (u) hashMap.get(abstractComponentCallbacksC0157f.f2852r);
        if (uVar2 == null) {
            uVar2 = new u(uVar.f2919f);
            hashMap.put(abstractComponentCallbacksC0157f.f2852r, uVar2);
        }
        this.f2901R = uVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0042, code lost:
    
        if ((r7 & 1) != 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0044, code lost:
    
        r0 = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0046, code lost:
    
        if (r0 < 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        r7 = (androidx.fragment.app.C0152a) r3.f2908v.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0050, code lost:
    
        if (r6 < 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r6 != r7.f2785t) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b0(java.util.ArrayList r4, java.util.ArrayList r5, int r6, int r7) {
        /*
            r3 = this;
            java.util.ArrayList r0 = r3.f2908v
            if (r0 != 0) goto L5
            goto L61
        L5:
            r1 = 1
            if (r6 >= 0) goto L23
            r2 = r7 & 1
            if (r2 != 0) goto L23
            int r6 = r0.size()
            int r6 = r6 - r1
            if (r6 >= 0) goto L14
            goto L61
        L14:
            java.util.ArrayList r7 = r3.f2908v
            java.lang.Object r6 = r7.remove(r6)
            r4.add(r6)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r5.add(r4)
            return r1
        L23:
            if (r6 < 0) goto L57
            int r0 = r0.size()
            int r0 = r0 - r1
        L2a:
            if (r0 < 0) goto L3e
            java.util.ArrayList r2 = r3.f2908v
            java.lang.Object r2 = r2.get(r0)
            androidx.fragment.app.a r2 = (androidx.fragment.app.C0152a) r2
            if (r6 < 0) goto L3b
            int r2 = r2.f2785t
            if (r6 != r2) goto L3b
            goto L3e
        L3b:
            int r0 = r0 + (-1)
            goto L2a
        L3e:
            if (r0 >= 0) goto L41
            goto L61
        L41:
            r7 = r7 & r1
            if (r7 == 0) goto L58
        L44:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L58
            java.util.ArrayList r7 = r3.f2908v
            java.lang.Object r7 = r7.get(r0)
            androidx.fragment.app.a r7 = (androidx.fragment.app.C0152a) r7
            if (r6 < 0) goto L58
            int r7 = r7.f2785t
            if (r6 != r7) goto L58
            goto L44
        L57:
            r0 = -1
        L58:
            java.util.ArrayList r6 = r3.f2908v
            int r6 = r6.size()
            int r6 = r6 - r1
            if (r0 != r6) goto L63
        L61:
            r4 = 0
            return r4
        L63:
            java.util.ArrayList r6 = r3.f2908v
            int r6 = r6.size()
            int r6 = r6 - r1
        L6a:
            if (r6 <= r0) goto L7d
            java.util.ArrayList r7 = r3.f2908v
            java.lang.Object r7 = r7.remove(r6)
            r4.add(r7)
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r5.add(r7)
            int r6 = r6 + (-1)
            goto L6a
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.b0(java.util.ArrayList, java.util.ArrayList, int, int):boolean");
    }

    public final void c(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f.f2831M) {
            abstractComponentCallbacksC0157f.f2831M = false;
            if (abstractComponentCallbacksC0157f.f2858x) {
                return;
            }
            if (this.f2906t.contains(abstractComponentCallbacksC0157f)) {
                throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0157f);
            }
            synchronized (this.f2906t) {
                this.f2906t.add(abstractComponentCallbacksC0157f);
            }
            abstractComponentCallbacksC0157f.f2858x = true;
            if (Q(abstractComponentCallbacksC0157f)) {
                this.f2892H = true;
            }
        }
    }

    public final void c0(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        boolean z4 = abstractComponentCallbacksC0157f.f2822D > 0;
        if (abstractComponentCallbacksC0157f.f2831M && z4) {
            return;
        }
        synchronized (this.f2906t) {
            this.f2906t.remove(abstractComponentCallbacksC0157f);
        }
        if (Q(abstractComponentCallbacksC0157f)) {
            this.f2892H = true;
        }
        abstractComponentCallbacksC0157f.f2858x = false;
        abstractComponentCallbacksC0157f.y = true;
    }

    public final void d() {
        this.f2904r = false;
        this.N.clear();
        this.f2897M.clear();
    }

    public final void d0(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        M(arrayList, arrayList2);
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i4 < size) {
            if (!((C0152a) arrayList.get(i4)).f2782q) {
                if (i5 != i4) {
                    L(arrayList, arrayList2, i5, i4);
                }
                i5 = i4 + 1;
                if (((Boolean) arrayList2.get(i4)).booleanValue()) {
                    while (i5 < size && ((Boolean) arrayList2.get(i5)).booleanValue() && !((C0152a) arrayList.get(i5)).f2782q) {
                        i5++;
                    }
                }
                L(arrayList, arrayList2, i4, i5);
                i4 = i5 - 1;
            }
            i4++;
        }
        if (i5 != size) {
            L(arrayList, arrayList2, i5, size);
        }
    }

    public final void e(C0152a c0152a, boolean z4, boolean z5, boolean z6) {
        s sVar;
        if (z4) {
            c0152a.h(z6);
        } else {
            c0152a.g();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0152a);
        arrayList2.add(Boolean.valueOf(z4));
        if (z5) {
            sVar = this;
            B.j(sVar, arrayList, arrayList2, 0, 1, true);
        } else {
            sVar = this;
        }
        if (z6) {
            X(sVar.f2887C, true);
        }
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : sVar.f2907u.values()) {
            if (abstractComponentCallbacksC0157f != null && abstractComponentCallbacksC0157f.f2835R != null && abstractComponentCallbacksC0157f.f2840W && c0152a.i(abstractComponentCallbacksC0157f.f2828J)) {
                float f4 = abstractComponentCallbacksC0157f.f2842Y;
                if (f4 > 0.0f) {
                    abstractComponentCallbacksC0157f.f2835R.setAlpha(f4);
                }
                if (z6) {
                    abstractComponentCallbacksC0157f.f2842Y = 0.0f;
                } else {
                    abstractComponentCallbacksC0157f.f2842Y = -1.0f;
                    abstractComponentCallbacksC0157f.f2840W = false;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, androidx.fragment.app.w] */
    public final void e0(Parcelable parcelable) {
        v vVar;
        s sVar = this;
        if (parcelable == null) {
            return;
        }
        t tVar = (t) parcelable;
        if (tVar.f2912o == null) {
            return;
        }
        Iterator it = sVar.f2901R.c.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) it.next();
            ArrayList arrayList = tVar.f2912o;
            int size = arrayList.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    vVar = null;
                    break;
                }
                Object obj = arrayList.get(i4);
                i4++;
                vVar = (v) obj;
                if (vVar.f2924p.equals(abstractComponentCallbacksC0157f.f2852r)) {
                    break;
                }
            }
            if (vVar == null) {
                sVar.Y(abstractComponentCallbacksC0157f, 1, 0, 0, false);
                abstractComponentCallbacksC0157f.y = true;
                sVar = this;
                sVar.Y(abstractComponentCallbacksC0157f, 0, 0, 0, false);
            } else {
                vVar.f2922B = abstractComponentCallbacksC0157f;
                abstractComponentCallbacksC0157f.f2851q = null;
                abstractComponentCallbacksC0157f.f2822D = 0;
                abstractComponentCallbacksC0157f.f2819A = false;
                abstractComponentCallbacksC0157f.f2858x = false;
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = abstractComponentCallbacksC0157f.f2854t;
                abstractComponentCallbacksC0157f.f2855u = abstractComponentCallbacksC0157f2 != null ? abstractComponentCallbacksC0157f2.f2852r : null;
                abstractComponentCallbacksC0157f.f2854t = null;
                Bundle bundle = vVar.f2921A;
                if (bundle != null) {
                    bundle.setClassLoader(sVar.f2888D.f2861q.getClassLoader());
                    abstractComponentCallbacksC0157f.f2851q = vVar.f2921A.getSparseParcelableArray("android:view_state");
                    abstractComponentCallbacksC0157f.f2850p = vVar.f2921A;
                }
            }
        }
        sVar.f2907u.clear();
        ArrayList arrayList2 = tVar.f2912o;
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            v vVar2 = (v) obj2;
            if (vVar2 != null) {
                ClassLoader classLoader = sVar.f2888D.f2861q.getClassLoader();
                C0159h P4 = sVar.P();
                Bundle bundle2 = vVar2.f2932x;
                if (vVar2.f2922B == null) {
                    if (bundle2 != null) {
                        bundle2.setClassLoader(classLoader);
                    }
                    AbstractComponentCallbacksC0157f a4 = P4.a(classLoader, vVar2.f2923o);
                    vVar2.f2922B = a4;
                    a4.G(bundle2);
                    Bundle bundle3 = vVar2.f2921A;
                    if (bundle3 != null) {
                        bundle3.setClassLoader(classLoader);
                        vVar2.f2922B.f2850p = vVar2.f2921A;
                    } else {
                        vVar2.f2922B.f2850p = new Bundle();
                    }
                    AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f3 = vVar2.f2922B;
                    abstractComponentCallbacksC0157f3.f2852r = vVar2.f2924p;
                    abstractComponentCallbacksC0157f3.f2859z = vVar2.f2925q;
                    abstractComponentCallbacksC0157f3.f2820B = true;
                    abstractComponentCallbacksC0157f3.f2827I = vVar2.f2926r;
                    abstractComponentCallbacksC0157f3.f2828J = vVar2.f2927s;
                    abstractComponentCallbacksC0157f3.f2829K = vVar2.f2928t;
                    abstractComponentCallbacksC0157f3.N = vVar2.f2929u;
                    abstractComponentCallbacksC0157f3.y = vVar2.f2930v;
                    abstractComponentCallbacksC0157f3.f2831M = vVar2.f2931w;
                    abstractComponentCallbacksC0157f3.f2830L = vVar2.y;
                    abstractComponentCallbacksC0157f3.f2844a0 = androidx.lifecycle.g.values()[vVar2.f2933z];
                }
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f4 = vVar2.f2922B;
                abstractComponentCallbacksC0157f4.f2823E = sVar;
                sVar.f2907u.put(abstractComponentCallbacksC0157f4.f2852r, abstractComponentCallbacksC0157f4);
                vVar2.f2922B = null;
            }
        }
        sVar.f2906t.clear();
        ArrayList arrayList3 = tVar.f2913p;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                String str = (String) obj3;
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f5 = (AbstractComponentCallbacksC0157f) sVar.f2907u.get(str);
                if (abstractComponentCallbacksC0157f5 == null) {
                    sVar.m0(new IllegalStateException(U.a.k("No instantiated fragment for (", str, ")")));
                    throw null;
                }
                abstractComponentCallbacksC0157f5.f2858x = true;
                if (sVar.f2906t.contains(abstractComponentCallbacksC0157f5)) {
                    throw new IllegalStateException("Already added " + abstractComponentCallbacksC0157f5);
                }
                synchronized (sVar.f2906t) {
                    sVar.f2906t.add(abstractComponentCallbacksC0157f5);
                }
            }
        }
        if (tVar.f2914q != null) {
            sVar.f2908v = new ArrayList(tVar.f2914q.length);
            int i7 = 0;
            while (true) {
                C0153b[] c0153bArr = tVar.f2914q;
                if (i7 >= c0153bArr.length) {
                    break;
                }
                C0153b c0153b = c0153bArr[i7];
                int[] iArr = c0153b.f2789o;
                C0152a c0152a = new C0152a(sVar);
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    ?? obj4 = new Object();
                    int i10 = i8 + 1;
                    obj4.f2934a = iArr[i8];
                    String str2 = (String) c0153b.f2790p.get(i9);
                    if (str2 != null) {
                        obj4.f2935b = (AbstractComponentCallbacksC0157f) sVar.f2907u.get(str2);
                    } else {
                        obj4.f2935b = null;
                    }
                    obj4.f2938g = androidx.lifecycle.g.values()[c0153b.f2791q[i9]];
                    obj4.f2939h = androidx.lifecycle.g.values()[c0153b.f2792r[i9]];
                    int i11 = iArr[i10];
                    obj4.c = i11;
                    int i12 = iArr[i8 + 2];
                    obj4.d = i12;
                    int i13 = i8 + 4;
                    int i14 = iArr[i8 + 3];
                    obj4.f2936e = i14;
                    i8 += 5;
                    int i15 = iArr[i13];
                    obj4.f2937f = i15;
                    c0152a.f2769b = i11;
                    c0152a.c = i12;
                    c0152a.d = i14;
                    c0152a.f2770e = i15;
                    c0152a.b(obj4);
                    i9++;
                }
                c0152a.f2771f = c0153b.f2793s;
                c0152a.f2772g = c0153b.f2794t;
                c0152a.f2775j = c0153b.f2795u;
                c0152a.f2785t = c0153b.f2796v;
                c0152a.f2773h = true;
                c0152a.f2776k = c0153b.f2797w;
                c0152a.f2777l = c0153b.f2798x;
                c0152a.f2778m = c0153b.y;
                c0152a.f2779n = c0153b.f2799z;
                c0152a.f2780o = c0153b.f2786A;
                c0152a.f2781p = c0153b.f2787B;
                c0152a.f2782q = c0153b.f2788C;
                c0152a.d(1);
                sVar.f2908v.add(c0152a);
                int i16 = c0152a.f2785t;
                if (i16 >= 0) {
                    sVar.i0(i16, c0152a);
                }
                i7++;
            }
        } else {
            sVar.f2908v = null;
        }
        String str3 = tVar.f2915r;
        if (str3 != null) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f6 = (AbstractComponentCallbacksC0157f) sVar.f2907u.get(str3);
            sVar.f2891G = abstractComponentCallbacksC0157f6;
            sVar.C(abstractComponentCallbacksC0157f6);
        }
        sVar.f2905s = tVar.f2916s;
    }

    public final void f(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f.f2831M) {
            return;
        }
        abstractComponentCallbacksC0157f.f2831M = true;
        if (abstractComponentCallbacksC0157f.f2858x) {
            synchronized (this.f2906t) {
                this.f2906t.remove(abstractComponentCallbacksC0157f);
            }
            if (Q(abstractComponentCallbacksC0157f)) {
                this.f2892H = true;
            }
            abstractComponentCallbacksC0157f.f2858x = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.t, java.lang.Object] */
    public final t f0() {
        int i4;
        ArrayList arrayList;
        C0153b[] c0153bArr;
        int size;
        Bundle bundle;
        HashMap hashMap = this.f2907u;
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) it.next();
            if (abstractComponentCallbacksC0157f != null) {
                if (abstractComponentCallbacksC0157f.i() != null) {
                    C0156e c0156e = abstractComponentCallbacksC0157f.f2839V;
                    int i5 = c0156e != null ? c0156e.c : 0;
                    View i6 = abstractComponentCallbacksC0157f.i();
                    Animation animation = i6.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        i6.clearAnimation();
                    }
                    abstractComponentCallbacksC0157f.b().f2810a = null;
                    Y(abstractComponentCallbacksC0157f, i5, 0, 0, false);
                } else if (abstractComponentCallbacksC0157f.j() != null) {
                    abstractComponentCallbacksC0157f.j().end();
                }
            }
        }
        K();
        this.f2893I = true;
        if (!hashMap.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(hashMap.size());
            boolean z4 = false;
            for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 : hashMap.values()) {
                if (abstractComponentCallbacksC0157f2 != null) {
                    if (abstractComponentCallbacksC0157f2.f2823E != this) {
                        m0(new IllegalStateException(U.a.j("Failure saving state: active ", abstractComponentCallbacksC0157f2, " was removed from the FragmentManager")));
                        throw null;
                    }
                    v vVar = new v(abstractComponentCallbacksC0157f2);
                    arrayList2.add(vVar);
                    if (abstractComponentCallbacksC0157f2.f2849o <= 0 || vVar.f2921A != null) {
                        vVar.f2921A = abstractComponentCallbacksC0157f2.f2850p;
                    } else {
                        if (this.f2899P == null) {
                            this.f2899P = new Bundle();
                        }
                        Bundle bundle2 = this.f2899P;
                        abstractComponentCallbacksC0157f2.y(bundle2);
                        abstractComponentCallbacksC0157f2.f2848e0.b(bundle2);
                        t f02 = abstractComponentCallbacksC0157f2.f2825G.f0();
                        if (f02 != null) {
                            bundle2.putParcelable("android:support:fragments", f02);
                        }
                        v(false);
                        if (this.f2899P.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = this.f2899P;
                            this.f2899P = null;
                        }
                        if (abstractComponentCallbacksC0157f2.f2835R != null) {
                            g0(abstractComponentCallbacksC0157f2);
                        }
                        if (abstractComponentCallbacksC0157f2.f2851q != null) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putSparseParcelableArray("android:view_state", abstractComponentCallbacksC0157f2.f2851q);
                        }
                        if (!abstractComponentCallbacksC0157f2.f2838U) {
                            if (bundle == null) {
                                bundle = new Bundle();
                            }
                            bundle.putBoolean("android:user_visible_hint", abstractComponentCallbacksC0157f2.f2838U);
                        }
                        vVar.f2921A = bundle;
                        String str = abstractComponentCallbacksC0157f2.f2855u;
                        if (str != null) {
                            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f3 = (AbstractComponentCallbacksC0157f) hashMap.get(str);
                            if (abstractComponentCallbacksC0157f3 == null) {
                                m0(new IllegalStateException("Failure saving state: " + abstractComponentCallbacksC0157f2 + " has target not in fragment manager: " + abstractComponentCallbacksC0157f2.f2855u));
                                throw null;
                            }
                            if (vVar.f2921A == null) {
                                vVar.f2921A = new Bundle();
                            }
                            Bundle bundle3 = vVar.f2921A;
                            if (abstractComponentCallbacksC0157f3.f2823E != this) {
                                m0(new IllegalStateException(U.a.j("Fragment ", abstractComponentCallbacksC0157f3, " is not currently in the FragmentManager")));
                                throw null;
                            }
                            bundle3.putString("android:target_state", abstractComponentCallbacksC0157f3.f2852r);
                            int i7 = abstractComponentCallbacksC0157f2.f2856v;
                            if (i7 != 0) {
                                vVar.f2921A.putInt("android:target_req_state", i7);
                            }
                        }
                    }
                    z4 = true;
                }
            }
            if (z4) {
                ArrayList arrayList3 = this.f2906t;
                int size2 = arrayList3.size();
                if (size2 > 0) {
                    arrayList = new ArrayList(size2);
                    int size3 = arrayList3.size();
                    int i8 = 0;
                    while (i8 < size3) {
                        Object obj = arrayList3.get(i8);
                        i8++;
                        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f4 = (AbstractComponentCallbacksC0157f) obj;
                        arrayList.add(abstractComponentCallbacksC0157f4.f2852r);
                        if (abstractComponentCallbacksC0157f4.f2823E != this) {
                            m0(new IllegalStateException(U.a.j("Failure saving state: active ", abstractComponentCallbacksC0157f4, " was removed from the FragmentManager")));
                            throw null;
                        }
                    }
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = this.f2908v;
                if (arrayList4 == null || (size = arrayList4.size()) <= 0) {
                    c0153bArr = null;
                } else {
                    c0153bArr = new C0153b[size];
                    while (i4 < size) {
                        c0153bArr[i4] = new C0153b((C0152a) this.f2908v.get(i4));
                        i4++;
                    }
                }
                ?? obj2 = new Object();
                obj2.f2915r = null;
                obj2.f2912o = arrayList2;
                obj2.f2913p = arrayList;
                obj2.f2914q = c0153bArr;
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f5 = this.f2891G;
                if (abstractComponentCallbacksC0157f5 != null) {
                    obj2.f2915r = abstractComponentCallbacksC0157f5.f2852r;
                }
                obj2.f2916s = this.f2905s;
                return obj2;
            }
        }
        return null;
    }

    public final void g(Configuration configuration) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f2906t;
            if (i4 >= arrayList.size()) {
                return;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
            if (abstractComponentCallbacksC0157f != null) {
                abstractComponentCallbacksC0157f.onConfigurationChanged(configuration);
                abstractComponentCallbacksC0157f.f2825G.g(configuration);
            }
            i4++;
        }
    }

    public final void g0(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f.f2836S == null) {
            return;
        }
        SparseArray sparseArray = this.f2900Q;
        if (sparseArray == null) {
            this.f2900Q = new SparseArray();
        } else {
            sparseArray.clear();
        }
        abstractComponentCallbacksC0157f.f2836S.saveHierarchyState(this.f2900Q);
        if (this.f2900Q.size() > 0) {
            abstractComponentCallbacksC0157f.f2851q = this.f2900Q;
            this.f2900Q = null;
        }
    }

    public final boolean h() {
        if (this.f2887C >= 1) {
            int i4 = 0;
            while (true) {
                ArrayList arrayList = this.f2906t;
                if (i4 >= arrayList.size()) {
                    break;
                }
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
                if (abstractComponentCallbacksC0157f != null && !abstractComponentCallbacksC0157f.f2830L && abstractComponentCallbacksC0157f.f2825G.h()) {
                    return true;
                }
                i4++;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0012 A[Catch: all -> 0x000d, TryCatch #0 {all -> 0x000d, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0012, B:10:0x0027), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h0() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.ArrayList r0 = r2.f2903q     // Catch: java.lang.Throwable -> Ld
            if (r0 == 0) goto Lf
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Ld
            r1 = 1
            if (r0 != r1) goto Lf
            goto L10
        Ld:
            r0 = move-exception
            goto L29
        Lf:
            r1 = 0
        L10:
            if (r1 == 0) goto L27
            androidx.fragment.app.g r0 = r2.f2888D     // Catch: java.lang.Throwable -> Ld
            android.os.Handler r0 = r0.f2862r     // Catch: java.lang.Throwable -> Ld
            D0.o r1 = r2.f2902S     // Catch: java.lang.Throwable -> Ld
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> Ld
            androidx.fragment.app.g r0 = r2.f2888D     // Catch: java.lang.Throwable -> Ld
            android.os.Handler r0 = r0.f2862r     // Catch: java.lang.Throwable -> Ld
            D0.o r1 = r2.f2902S     // Catch: java.lang.Throwable -> Ld
            r0.post(r1)     // Catch: java.lang.Throwable -> Ld
            r2.n0()     // Catch: java.lang.Throwable -> Ld
        L27:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            return
        L29:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.s.h0():void");
    }

    public final boolean i() {
        if (this.f2887C < 1) {
            return false;
        }
        ArrayList arrayList = null;
        int i4 = 0;
        boolean z4 = false;
        while (true) {
            ArrayList arrayList2 = this.f2906t;
            if (i4 >= arrayList2.size()) {
                break;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList2.get(i4);
            if (abstractComponentCallbacksC0157f != null) {
                if (!abstractComponentCallbacksC0157f.f2830L ? abstractComponentCallbacksC0157f.f2825G.i() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0157f);
                    z4 = true;
                }
            }
            i4++;
        }
        if (this.f2909w != null) {
            for (int i5 = 0; i5 < this.f2909w.size(); i5++) {
                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = (AbstractComponentCallbacksC0157f) this.f2909w.get(i5);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0157f2)) {
                    abstractComponentCallbacksC0157f2.getClass();
                }
            }
        }
        this.f2909w = arrayList;
        return z4;
    }

    public final void i0(int i4, C0152a c0152a) {
        synchronized (this) {
            try {
                if (this.f2911z == null) {
                    this.f2911z = new ArrayList();
                }
                int size = this.f2911z.size();
                if (i4 < size) {
                    this.f2911z.set(i4, c0152a);
                } else {
                    while (size < i4) {
                        this.f2911z.add(null);
                        if (this.f2885A == null) {
                            this.f2885A = new ArrayList();
                        }
                        this.f2885A.add(Integer.valueOf(size));
                        size++;
                    }
                    this.f2911z.add(c0152a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        this.f2895K = true;
        K();
        F(0);
        this.f2888D = null;
        this.f2889E = null;
        this.f2890F = null;
        if (this.f2910x != null) {
            Iterator it = this.y.f2869b.iterator();
            while (it.hasNext()) {
                ((androidx.activity.a) it.next()).cancel();
            }
            this.f2910x = null;
        }
    }

    public final void j0(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f, androidx.lifecycle.g gVar) {
        if (this.f2907u.get(abstractComponentCallbacksC0157f.f2852r) == abstractComponentCallbacksC0157f && (abstractComponentCallbacksC0157f.f2824F == null || abstractComponentCallbacksC0157f.f2823E == this)) {
            abstractComponentCallbacksC0157f.f2844a0 = gVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0157f + " is not an active fragment of FragmentManager " + this);
    }

    public final void k() {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = this.f2906t;
            if (i4 >= arrayList.size()) {
                return;
            }
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(i4);
            if (abstractComponentCallbacksC0157f != null) {
                abstractComponentCallbacksC0157f.f2833P = true;
                abstractComponentCallbacksC0157f.f2825G.k();
            }
            i4++;
        }
    }

    public final void k0(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        if (abstractComponentCallbacksC0157f == null || (this.f2907u.get(abstractComponentCallbacksC0157f.f2852r) == abstractComponentCallbacksC0157f && (abstractComponentCallbacksC0157f.f2824F == null || abstractComponentCallbacksC0157f.f2823E == this))) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = this.f2891G;
            this.f2891G = abstractComponentCallbacksC0157f;
            C(abstractComponentCallbacksC0157f2);
            C(this.f2891G);
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0157f + " is not an active fragment of FragmentManager " + this);
    }

    public final void l() {
        ArrayList arrayList = this.f2906t;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(size);
            if (abstractComponentCallbacksC0157f != null) {
                abstractComponentCallbacksC0157f.f2825G.l();
            }
        }
    }

    public final void l0() {
        for (AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f : this.f2907u.values()) {
            if (abstractComponentCallbacksC0157f != null && abstractComponentCallbacksC0157f.f2837T) {
                if (this.f2904r) {
                    this.f2896L = true;
                } else {
                    abstractComponentCallbacksC0157f.f2837T = false;
                    Y(abstractComponentCallbacksC0157f, this.f2887C, 0, 0, false);
                }
            }
        }
    }

    public final void m(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.m(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void m0(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new G.a());
        C0158g c0158g = this.f2888D;
        if (c0158g == null) {
            try {
                H("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e4) {
                Log.e("FragmentManager", "Failed dumping state", e4);
                throw runtimeException;
            }
        }
        try {
            c0158g.f2864t.dump("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e5) {
            Log.e("FragmentManager", "Failed dumping state", e5);
            throw runtimeException;
        }
    }

    public final void n(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.n(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void n0() {
        ArrayList arrayList = this.f2903q;
        C0161j c0161j = this.y;
        if (arrayList != null && !arrayList.isEmpty()) {
            c0161j.f2868a = true;
        } else {
            ArrayList arrayList2 = this.f2908v;
            c0161j.f2868a = (arrayList2 != null ? arrayList2.size() : 0) > 0 && R(this.f2890F);
        }
    }

    public final void o(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.o(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z4;
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f2880o);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            String str2 = attributeValue;
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (str2 != null) {
                ClassLoader classLoader = context.getClassLoader();
                try {
                    r.i iVar = C0159h.f2865a;
                    Class<?> cls = (Class) iVar.get(str2);
                    if (cls == null) {
                        cls = Class.forName(str2, false, classLoader);
                        iVar.put(str2, cls);
                    }
                    z4 = AbstractComponentCallbacksC0157f.class.isAssignableFrom(cls);
                } catch (ClassNotFoundException unused) {
                    z4 = false;
                }
                if (z4) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
                    }
                    AbstractComponentCallbacksC0157f N = resourceId != -1 ? N(resourceId) : null;
                    if (N == null && string != null) {
                        ArrayList arrayList = this.f2906t;
                        int size = arrayList.size() - 1;
                        while (true) {
                            if (size >= 0) {
                                AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = (AbstractComponentCallbacksC0157f) arrayList.get(size);
                                if (abstractComponentCallbacksC0157f != null && string.equals(abstractComponentCallbacksC0157f.f2829K)) {
                                    N = abstractComponentCallbacksC0157f;
                                    break;
                                }
                                size--;
                            } else {
                                Iterator it = this.f2907u.values().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        N = null;
                                        break;
                                    }
                                    AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f2 = (AbstractComponentCallbacksC0157f) it.next();
                                    if (abstractComponentCallbacksC0157f2 != null && string.equals(abstractComponentCallbacksC0157f2.f2829K)) {
                                        N = abstractComponentCallbacksC0157f2;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    if (N == null && id != -1) {
                        N = N(id);
                    }
                    if (N == null) {
                        N = P().a(context.getClassLoader(), str2);
                        N.f2859z = true;
                        N.f2827I = resourceId != 0 ? resourceId : id;
                        N.f2828J = id;
                        N.f2829K = string;
                        N.f2819A = true;
                        N.f2823E = this;
                        C0158g c0158g = this.f2888D;
                        N.f2824F = c0158g;
                        AbstractActivityC1671f abstractActivityC1671f = c0158g.f2861q;
                        N.f2833P = true;
                        if ((c0158g != null ? c0158g.f2860p : null) != null) {
                            N.f2833P = true;
                        }
                        a(N, true);
                    } else {
                        if (N.f2819A) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + str2);
                        }
                        N.f2819A = true;
                        C0158g c0158g2 = this.f2888D;
                        N.f2824F = c0158g2;
                        AbstractActivityC1671f abstractActivityC1671f2 = c0158g2.f2861q;
                        N.f2833P = true;
                        if ((c0158g2 != null ? c0158g2.f2860p : null) != null) {
                            N.f2833P = true;
                        }
                    }
                    AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f3 = N;
                    int i4 = this.f2887C;
                    if (i4 >= 1 || !abstractComponentCallbacksC0157f3.f2859z) {
                        Y(abstractComponentCallbacksC0157f3, i4, 0, 0, false);
                    } else {
                        Y(abstractComponentCallbacksC0157f3, 1, 0, 0, false);
                    }
                    View view2 = abstractComponentCallbacksC0157f3.f2835R;
                    if (view2 == null) {
                        throw new IllegalStateException(U.a.k("Fragment ", str2, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0157f3.f2835R.getTag() == null) {
                        abstractComponentCallbacksC0157f3.f2835R.setTag(string);
                    }
                    return abstractComponentCallbacksC0157f3.f2835R;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public final void p(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.p(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void q(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.q(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void r(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.r(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void s(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.s(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void t(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.t(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null) {
            android.support.v4.media.session.a.a(abstractComponentCallbacksC0157f, sb);
        } else {
            android.support.v4.media.session.a.a(this.f2888D, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.u(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void v(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.v(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void w(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.w(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void x(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.x(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void y(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.y(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }

    public final void z(boolean z4) {
        s sVar;
        AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = this.f2890F;
        if (abstractComponentCallbacksC0157f != null && (sVar = abstractComponentCallbacksC0157f.f2823E) != null) {
            sVar.z(true);
        }
        Iterator it = this.f2886B.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z4) {
                throw null;
            }
            throw null;
        }
    }
}
