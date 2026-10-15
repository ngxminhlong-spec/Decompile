package s1;

import android.graphics.Paint;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import java.util.ArrayList;
import q1.AbstractC1955j;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: s1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1976f {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f14771a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f14772b = new ArrayList();
    public long c;
    public long d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14773e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14774f;

    /* renamed from: g, reason: collision with root package name */
    public final Paint f14775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BoardView f14776h;

    public C1976f(BoardView boardView) {
        this.f14776h = boardView;
        Paint paint = new Paint();
        this.f14775g = paint;
        paint.setStrokeWidth(AbstractC1955j.f14690r);
        paint.setColor(AbstractC1955j.f14689q);
        paint.setStyle(Paint.Style.STROKE);
    }
}
