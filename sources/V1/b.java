package V1;

import H1.k;
import android.os.RemoteException;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C7;
import com.google.android.gms.internal.ads.InterfaceC1281v7;
import com.google.android.gms.internal.ads.Y9;
import n2.BinderC1813b;
import x0.f;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public boolean f1836o;

    /* renamed from: p, reason: collision with root package name */
    public ImageView.ScaleType f1837p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f1838q;

    /* renamed from: r, reason: collision with root package name */
    public f f1839r;

    /* renamed from: s, reason: collision with root package name */
    public D3.d f1840s;

    public final synchronized void a(D3.d dVar) {
        this.f1840s = dVar;
        if (this.f1838q) {
            ImageView.ScaleType scaleType = this.f1837p;
            InterfaceC1281v7 interfaceC1281v7 = ((e) dVar.f677p).f1849p;
            if (interfaceC1281v7 != null && scaleType != null) {
                try {
                    interfaceC1281v7.k2(new BinderC1813b(scaleType));
                } catch (RemoteException e4) {
                    Y9.q("Unable to call setMediaViewImageScaleType on delegate", e4);
                }
            }
        }
    }

    public k getMediaContent() {
        return null;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        InterfaceC1281v7 interfaceC1281v7;
        this.f1838q = true;
        this.f1837p = scaleType;
        D3.d dVar = this.f1840s;
        if (dVar == null || (interfaceC1281v7 = ((e) dVar.f677p).f1849p) == null || scaleType == null) {
            return;
        }
        try {
            interfaceC1281v7.k2(new BinderC1813b(scaleType));
        } catch (RemoteException e4) {
            Y9.q("Unable to call setMediaViewImageScaleType on delegate", e4);
        }
    }

    public void setMediaContent(k kVar) {
        boolean f02;
        InterfaceC1281v7 interfaceC1281v7;
        this.f1836o = true;
        f fVar = this.f1839r;
        if (fVar != null && (interfaceC1281v7 = ((e) fVar.f15212p).f1849p) != null) {
            try {
                interfaceC1281v7.D2(null);
            } catch (RemoteException e4) {
                Y9.q("Unable to call setMediaContent on delegate", e4);
            }
        }
        if (kVar == null) {
            return;
        }
        try {
            C7 b4 = kVar.b();
            if (b4 != null) {
                if (!kVar.d()) {
                    if (kVar.c()) {
                        f02 = b4.f0(new BinderC1813b(this));
                    }
                    removeAllViews();
                }
                f02 = b4.X(new BinderC1813b(this));
                if (f02) {
                    return;
                }
                removeAllViews();
            }
        } catch (RemoteException e5) {
            removeAllViews();
            Y9.q("", e5);
        }
    }
}
