package C2;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c extends Property {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f510a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f511b;

    public c() {
        super(Matrix.class, "imageMatrixProperty");
        this.f511b = new Matrix();
    }

    public /* synthetic */ c(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f510a) {
            case 0:
                Matrix matrix = (Matrix) this.f511b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
            default:
                ((Drawable) obj).copyBounds((Rect) this.f511b);
                return new PointF(r0.left, r0.top);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f510a) {
            case 0:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                return;
            default:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) this.f511b;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                return;
        }
    }
}
