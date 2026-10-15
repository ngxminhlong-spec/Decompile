package l;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ImageView;
import e.AbstractC1657a;
import g.AbstractC1678a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: l.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1789w {
    public static final int[] d = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13838a;

    /* renamed from: b, reason: collision with root package name */
    public View f13839b;
    public Object c;

    public /* synthetic */ C1789w(View view, int i4) {
        this.f13838a = i4;
        this.f13839b = view;
    }

    public void a() {
        z0 z0Var;
        ImageView imageView = (ImageView) this.f13839b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            int i4 = T.f13674a;
        }
        if (drawable == null || (z0Var = (z0) this.c) == null) {
            return;
        }
        r.e(drawable, z0Var, imageView.getDrawableState());
    }

    public void b(AttributeSet attributeSet, int i4) {
        int resourceId;
        switch (this.f13838a) {
            case 0:
                AbsSeekBar absSeekBar = (AbsSeekBar) this.f13839b;
                q2.e w2 = q2.e.w(absSeekBar.getContext(), attributeSet, d, i4);
                Drawable q4 = w2.q(0);
                if (q4 != null) {
                    if (q4 instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) q4;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i5 = 0; i5 < numberOfFrames; i5++) {
                            Drawable d4 = d(animationDrawable.getFrame(i5), true);
                            d4.setLevel(10000);
                            animationDrawable2.addFrame(d4, animationDrawable.getDuration(i5));
                        }
                        animationDrawable2.setLevel(10000);
                        q4 = animationDrawable2;
                    }
                    absSeekBar.setIndeterminateDrawable(q4);
                }
                Drawable q5 = w2.q(1);
                if (q5 != null) {
                    absSeekBar.setProgressDrawable(d(q5, false));
                }
                w2.y();
                return;
            default:
                ImageView imageView = (ImageView) this.f13839b;
                q2.e w4 = q2.e.w(imageView.getContext(), attributeSet, AbstractC1657a.f12638f, i4);
                TypedArray typedArray = (TypedArray) w4.f14710q;
                try {
                    Drawable drawable = imageView.getDrawable();
                    if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC1678a.a(imageView.getContext(), resourceId)) != null) {
                        imageView.setImageDrawable(drawable);
                    }
                    if (drawable != null) {
                        int i6 = T.f13674a;
                    }
                    if (typedArray.hasValue(2)) {
                        imageView.setImageTintList(w4.o(2));
                    }
                    if (typedArray.hasValue(3)) {
                        imageView.setImageTintMode(T.b(typedArray.getInt(3, -1), null));
                    }
                    w4.y();
                    return;
                } catch (Throwable th) {
                    w4.y();
                    throw th;
                }
        }
    }

    public void c(int i4) {
        ImageView imageView = (ImageView) this.f13839b;
        if (i4 != 0) {
            Drawable a4 = AbstractC1678a.a(imageView.getContext(), i4);
            if (a4 != null) {
                int i5 = T.f13674a;
            }
            imageView.setImageDrawable(a4);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable d(Drawable drawable, boolean z4) {
        if (drawable instanceof B.d) {
            ((B.e) ((B.d) drawable)).getClass();
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i4 = 0; i4 < numberOfLayers; i4++) {
                    int id = layerDrawable.getId(i4);
                    drawableArr[i4] = d(layerDrawable.getDrawable(i4), id == 16908301 || id == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i5 = 0; i5 < numberOfLayers; i5++) {
                    layerDrawable2.setId(i5, layerDrawable.getId(i5));
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (((Bitmap) this.c) == null) {
                    this.c = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z4 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
