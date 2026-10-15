package V1;

import O1.C0073l;
import O1.C0077n;
import O1.C0081p;
import O1.r;
import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0818ka;
import com.google.android.gms.internal.ads.InterfaceC1281v7;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;
import n2.InterfaceC1812a;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public final FrameLayout f1848o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC1281v7 f1849p;

    public e(Context context) {
        super(context);
        InterfaceC1281v7 interfaceC1281v7;
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(frameLayout);
        this.f1848o = frameLayout;
        if (isInEditMode()) {
            interfaceC1281v7 = null;
        } else {
            C0077n c0077n = C0081p.f1374f.f1376b;
            Context context2 = frameLayout.getContext();
            c0077n.getClass();
            interfaceC1281v7 = (InterfaceC1281v7) new C0073l(c0077n, this, frameLayout, context2).d(context2, false);
        }
        this.f1849p = interfaceC1281v7;
    }

    public final View a(String str) {
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 != null) {
            try {
                InterfaceC1812a B4 = interfaceC1281v7.B(str);
                if (B4 != null) {
                    return (View) BinderC1813b.C2(B4);
                }
            } catch (RemoteException e4) {
                Y9.q("Unable to call getAssetView on delegate", e4);
            }
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i4, layoutParams);
        super.bringChildToFront(this.f1848o);
    }

    public final void b(View view, String str) {
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 == null) {
            return;
        }
        try {
            interfaceC1281v7.P2(str, new BinderC1813b(view));
        } catch (RemoteException e4) {
            Y9.q("Unable to call setAssetView on delegate", e4);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void bringChildToFront(View view) {
        super.bringChildToFront(view);
        FrameLayout frameLayout = this.f1848o;
        if (frameLayout != view) {
            super.bringChildToFront(frameLayout);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 != null) {
            if (((Boolean) r.d.c.a(AbstractC1066q6.J9)).booleanValue()) {
                try {
                    interfaceC1281v7.H0(new BinderC1813b(motionEvent));
                } catch (RemoteException e4) {
                    Y9.q("Unable to call handleTouchEvent on delegate", e4);
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public a getAdChoicesView() {
        a("3011");
        return null;
    }

    public final View getAdvertiserView() {
        return a("3005");
    }

    public final View getBodyView() {
        return a("3004");
    }

    public final View getCallToActionView() {
        return a("3002");
    }

    public final View getHeadlineView() {
        return a("3001");
    }

    public final View getIconView() {
        return a("3003");
    }

    public final View getImageView() {
        return a("3008");
    }

    public final b getMediaView() {
        View a4 = a("3010");
        if (a4 instanceof b) {
            return (b) a4;
        }
        if (a4 == null) {
            return null;
        }
        Y9.m("View is not an instance of MediaView");
        return null;
    }

    public final View getPriceView() {
        return a("3007");
    }

    public final View getStarRatingView() {
        return a("3009");
    }

    public final View getStoreView() {
        return a("3006");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i4) {
        super.onVisibilityChanged(view, i4);
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 == null) {
            return;
        }
        try {
            interfaceC1281v7.F0(new BinderC1813b(view), i4);
        } catch (RemoteException e4) {
            Y9.q("Unable to call onVisibilityChanged on delegate", e4);
        }
    }

    @Override // android.view.ViewGroup
    public final void removeAllViews() {
        super.removeAllViews();
        addView(this.f1848o);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.f1848o == view) {
            return;
        }
        super.removeView(view);
    }

    public void setAdChoicesView(a aVar) {
        b(aVar, "3011");
    }

    public final void setAdvertiserView(View view) {
        b(view, "3005");
    }

    public final void setBodyView(View view) {
        b(view, "3004");
    }

    public final void setCallToActionView(View view) {
        b(view, "3002");
    }

    public final void setClickConfirmingView(View view) {
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 == null) {
            return;
        }
        try {
            interfaceC1281v7.V1(new BinderC1813b(view));
        } catch (RemoteException e4) {
            Y9.q("Unable to call setClickConfirmingView on delegate", e4);
        }
    }

    public final void setHeadlineView(View view) {
        b(view, "3001");
    }

    public final void setIconView(View view) {
        b(view, "3003");
    }

    public final void setImageView(View view) {
        b(view, "3008");
    }

    public final void setMediaView(b bVar) {
        InterfaceC1281v7 interfaceC1281v7;
        b(bVar, "3010");
        if (bVar == null) {
            return;
        }
        f fVar = new f(21, this);
        synchronized (bVar) {
            bVar.f1839r = fVar;
            if (bVar.f1836o && (interfaceC1281v7 = this.f1849p) != null) {
                try {
                    interfaceC1281v7.D2(null);
                } catch (RemoteException e4) {
                    Y9.q("Unable to call setMediaContent on delegate", e4);
                }
            }
        }
        bVar.a(new D3.d(20, this));
    }

    public void setNativeAd(c cVar) {
        InterfaceC1812a interfaceC1812a;
        InterfaceC1281v7 interfaceC1281v7 = this.f1849p;
        if (interfaceC1281v7 == null) {
            return;
        }
        try {
            C0818ka c0818ka = (C0818ka) cVar;
            c0818ka.getClass();
            try {
                interfaceC1812a = c0818ka.f9289a.q();
            } catch (RemoteException e4) {
                Y9.q("", e4);
                interfaceC1812a = null;
            }
            interfaceC1281v7.h3(interfaceC1812a);
        } catch (RemoteException e5) {
            Y9.q("Unable to call setNativeAd on delegate", e5);
        }
    }

    public final void setPriceView(View view) {
        b(view, "3007");
    }

    public final void setStarRatingView(View view) {
        b(view, "3009");
    }

    public final void setStoreView(View view) {
        b(view, "3006");
    }
}
