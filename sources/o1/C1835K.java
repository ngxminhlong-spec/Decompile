package o1;

import android.view.ScaleGestureDetector;
import android.view.View;
import com.duracodefactory.logiccircuitsimulatorpro.ui.ProgrammableArrayView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramView;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import s1.C1978h;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: o1.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1835K extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14213a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f14214b;

    public /* synthetic */ C1835K(View view, int i4) {
        this.f14213a = i4;
        this.f14214b = view;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14213a) {
            case 0:
                float focusX = scaleGestureDetector.getFocusX();
                float focusY = scaleGestureDetector.getFocusY();
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                ProgrammableArrayView programmableArrayView = (ProgrammableArrayView) this.f14214b;
                float f4 = programmableArrayView.f3694q;
                float f5 = scaleFactor * f4;
                programmableArrayView.f3694q = f5;
                float f6 = programmableArrayView.y;
                if (f5 < f6) {
                    programmableArrayView.f3694q = f6;
                } else {
                    float f7 = programmableArrayView.f3702z;
                    if (f5 > f7) {
                        programmableArrayView.f3694q = f7;
                    }
                }
                programmableArrayView.scrollBy((int) ((((programmableArrayView.getScrollX() + focusX) * (programmableArrayView.f3694q / f4)) - programmableArrayView.getScrollX()) - focusX), (int) ((((programmableArrayView.getScrollY() + focusY) * (programmableArrayView.f3694q / f4)) - programmableArrayView.getScrollY()) - focusY));
                programmableArrayView.invalidate();
                return true;
            case 1:
                float focusX2 = scaleGestureDetector.getFocusX();
                float focusY2 = scaleGestureDetector.getFocusY();
                float scaleFactor2 = scaleGestureDetector.getScaleFactor();
                TimeDiagramView timeDiagramView = (TimeDiagramView) this.f14214b;
                float f8 = timeDiagramView.f3753q;
                float f9 = scaleFactor2 * f8;
                timeDiagramView.f3753q = f9;
                float f10 = timeDiagramView.f3761z;
                if (f9 < f10) {
                    timeDiagramView.f3753q = f10;
                } else {
                    float f11 = timeDiagramView.f3738A;
                    if (f9 > f11) {
                        timeDiagramView.f3753q = f11;
                    }
                }
                timeDiagramView.scrollBy((int) ((((timeDiagramView.getScrollX() + focusX2) * (timeDiagramView.f3753q / f8)) - timeDiagramView.getScrollX()) - focusX2), (int) ((((timeDiagramView.getScrollY() + focusY2) * (timeDiagramView.f3753q / f8)) - timeDiagramView.getScrollY()) - focusY2));
                timeDiagramView.invalidate();
                return true;
            default:
                BoardView boardView = (BoardView) this.f14214b;
                boardView.f3828v.b();
                float focusX3 = scaleGestureDetector.getFocusX();
                float focusY3 = scaleGestureDetector.getFocusY();
                float scaleFactor3 = scaleGestureDetector.getScaleFactor();
                float f12 = boardView.f3825s;
                float f13 = scaleFactor3 * f12;
                boardView.f3825s = f13;
                float f14 = boardView.f3796B;
                if (f13 < f14) {
                    boardView.f3825s = f14;
                } else {
                    float f15 = boardView.f3797C;
                    if (f13 > f15) {
                        boardView.f3825s = f15;
                    }
                }
                C1978h c1978h = boardView.f3823q;
                c1978h.f14787i = boardView.f3825s;
                c1978h.a();
                boardView.scrollBy((int) ((((boardView.getScrollX() + focusX3) * (boardView.f3825s / f12)) - boardView.getScrollX()) - focusX3), (int) ((((boardView.getScrollY() + focusY3) * (boardView.f3825s / f12)) - boardView.getScrollY()) - focusY3));
                boardView.invalidate();
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        int i4 = this.f14213a;
        View view = this.f14214b;
        switch (i4) {
            case 0:
                return false;
            case 1:
                TimeDiagramView timeDiagramView = (TimeDiagramView) view;
                int i5 = TimeDiagramView.N;
                timeDiagramView.getClass();
                timeDiagramView.y = true;
                return true;
            default:
                ((BoardView) view).f3828v.b();
                return true;
        }
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        switch (this.f14213a) {
            case 1:
                super.onScaleEnd(scaleGestureDetector);
                TimeDiagramView timeDiagramView = (TimeDiagramView) this.f14214b;
                int i4 = TimeDiagramView.N;
                timeDiagramView.getClass();
                return;
            default:
                super.onScaleEnd(scaleGestureDetector);
                return;
        }
    }
}
