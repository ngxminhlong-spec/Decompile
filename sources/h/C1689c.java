package h;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1689c extends android.support.v4.media.session.a {
    public final ObjectAnimator d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13076e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.animation.TimeInterpolator, java.lang.Object, h.d] */
    public C1689c(AnimationDrawable animationDrawable, boolean z4, boolean z5) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i4 = z4 ? numberOfFrames - 1 : 0;
        int i5 = z4 ? 0 : numberOfFrames - 1;
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f13078b = numberOfFrames2;
        int[] iArr = obj.f13077a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f13077a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f13077a;
        int i6 = 0;
        for (int i7 = 0; i7 < numberOfFrames2; i7++) {
            int duration = animationDrawable.getDuration(z4 ? (numberOfFrames2 - i7) - 1 : i7);
            iArr2[i7] = duration;
            i6 += duration;
        }
        obj.c = i6;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i4, i5);
        ofInt.setAutoCancel(true);
        ofInt.setDuration(obj.c);
        ofInt.setInterpolator(obj);
        this.f13076e = z5;
        this.d = ofInt;
    }

    @Override // android.support.v4.media.session.a
    public final boolean c() {
        return this.f13076e;
    }

    @Override // android.support.v4.media.session.a
    public final void q() {
        this.d.reverse();
    }

    @Override // android.support.v4.media.session.a
    public final void t() {
        this.d.start();
    }

    @Override // android.support.v4.media.session.a
    public final void u() {
        this.d.cancel();
    }
}
